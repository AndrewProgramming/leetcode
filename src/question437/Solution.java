package question437;

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
    private List<Integer> rlist = new ArrayList<>();

    public int pathSum(TreeNode root, int sum) {
        if(root ==null) return 0;
        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);

    }

    int helper(TreeNode root, int sum) {
        if(root == null)return 0;
        int counter  = 0;
        if(root.val == sum){
            counter  = 1;
        }
        return counter+ helper(root.left,sum - root.val)+ helper(root.right,sum-root.val);
    }
}