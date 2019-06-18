package question501;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();
    TreeNode pre;
    int max = 0;
    int cur = 1;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        inorder(root);
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (pre != null) {
            if (pre.val == root.val) {
                cur++;
            } else {
                cur = 1;
            }
        }
        if (cur == max) {
            list.add(root.val);
        }
        if (cur > max) {
            list.clear();
            list.add(root.val);
            max = cur;
        }
        pre = root;
        inorder(root.right);
    }
}
