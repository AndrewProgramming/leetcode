package question783;

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
    public int minDiffInBST(TreeNode root) {
        helper(root);
        int min = rlist.get(1).val - rlist.get(0).val;
        for(int i = 1;i<rlist.size()-1;i++){
            min = Math.min(min,rlist.get(i+1).val - rlist.get(i).val);
        }
        return min;
    }
    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        rlist.add(root);
        helper(root.right);
    }
}