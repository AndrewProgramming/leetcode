package question106;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private int[] postorder;
    private int[] inorder;
    private Map<Integer, Integer> inOrderMap = new HashMap<>();
    int postIdx;

    public static void main(String[] args) {
        int[] postOrder = {9, 15, 7, 20, 3};
        int[] inOrder = {9, 3, 15, 20, 7};

        Solution solution = new Solution();
        solution.buildTree(inOrder, postOrder);
    }


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        this.postIdx = postorder.length - 1;


        return helper(0, inorder.length);
    }

    private TreeNode helper(int inLeft, int inRight) {
        if (inLeft == inRight) return null;
        int value = postorder[postIdx];
        TreeNode root = new TreeNode(value);
        int index = inOrderMap.get(value);

        postIdx--;

        root.right = helper(index + 1, inRight);//visit order should right -> left
        root.left = helper(inLeft, index);


        return root;

    }
}