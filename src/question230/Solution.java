package question230;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private List<TreeNode> rlist = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return rlist.get(k-1).val;
    }
    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        rlist.add(root);
        inOrder(root.right);
    }
}