package question257;

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
    List<String> rlist = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        String currString = "";
        helper(root,currString);
        return rlist;
    }
    
    private void helper(TreeNode root,String currString){
        if(root == null) return;
        if(root.left == null && root.right == null){
            rlist.add(currString+root.val);
        }
        helper(root.left,currString + root.val+ "->");
        helper(root.right,currString  + root.val+"->");
    }
    
  
}