package question270;

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
    List<Integer> list = new ArrayList<>();

    public int closestValue(TreeNode root, double target) {
        inOrderList(root);
        System.out.println(list);

        double diff = Math.abs(list.get(0) - target);
        int idx = 0;
        for (int i = 1; i < list.size(); i++) {
            if(Math.abs(list.get(i) - target)< diff){
                diff = Math.abs(list.get(i) - target);
                idx = i;
            }
        }

        return list.get(idx);

    }


    private void inOrderList(TreeNode root) {
        if (root == null) return;
        inOrderList(root.left);
        list.add(root.val);
        inOrderList(root.right);
    }
}