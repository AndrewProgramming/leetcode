package question285;

import java.util.ArrayList;
import java.util.List;

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
    private List<TreeNode> rlist = new ArrayList<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inOrder(root);
        try {

            for (int i = 0; i < rlist.size(); i++) {
                if (rlist.get(i).val == p.val) {
                    return rlist.get(i + 1);
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
        return null;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        rlist.add(root);
        inOrder(root.right);
    }
}