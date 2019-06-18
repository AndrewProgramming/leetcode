package question105;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private int[] preOrder;
    private int[] inOrder;
    private int idx = 0;
    private Map<Integer, Integer> idxMap = new HashMap<>();


    public static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        Solution solution = new Solution();
        solution.buildTree(preOrder, inOrder);
    }


    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        this.preOrder = preOrder;
        this.inOrder = inOrder;

        for (int i = 0; i < inOrder.length; i++) {
            idxMap.put(inOrder[i], i);
        }
        return helper(0, inOrder.length);
    }

    private TreeNode helper(int left, int right) {
        if (left == right) return null;
        TreeNode root = new TreeNode(preOrder[idx]);

        int index = idxMap.get(root.val);
        idx++;
        root.left = helper(left, index);
        root.right = helper(index + 1, right);

        return root;

    }

}