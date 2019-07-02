package question501;

import java.util.ArrayList;
import java.util.List;

//class Solution {
//    private List<Integer> rlist = new ArrayList<>();
//
//    public int[] findMode(TreeNode root) {
//        System.out.println(helper(root, root.val));
//    }
//
//    int helper(TreeNode root, int target) {
//        if (root == null) return rlist.toArray(new int[rlist.size()]);
//        int counter = 0;
//        if (target == root.val) counter++;
//        return counter + helper(root.left, target) + helper(root.right, target);
//    }
//}