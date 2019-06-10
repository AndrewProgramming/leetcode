package question617;

import java.util.Collections;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
执行用时 :2 ms, 在所有Java提交中击败了94.11%的用户
内存消耗 :47.8 MB, 在所有Java提交中击败了66.35%的用户
*/
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null ) return t2;
        if(t2 == null) return t1;

        t1.val +=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;

    }
}