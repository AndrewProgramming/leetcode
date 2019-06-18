package question270;

public class Solution1 {
    private double diff = -1;
    TreeNode node = null;

    public int closestValue(TreeNode root, double target) {
        return root.val;
    }

    private void helper(TreeNode root, double target) {
        if (root == null) return;
        if (diff < Math.abs(root.val - target)) {
            diff = Math.abs(root.val - target);
            node = root;
        }
        helper(root.left, target);
        helper(root.right, target);
    }

}
