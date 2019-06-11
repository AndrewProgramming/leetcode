package question199;

import java.util.LinkedList;
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rlist = new LinkedList<>();
        if(root == null) return rlist;

        List<TreeNode> llist = new LinkedList<>();
        llist.add(root);

        while(!llist.isEmpty()){
            int size = llist.size();
            List<Integer> ilist = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode curNode=llist.remove(0);
                ilist.add(curNode.val);
                if(curNode.left!=null){
                    llist.add(curNode.left);
                }
                if(curNode.right!=null){
                    llist.add(curNode.right);
                }
            }

            rlist.add(ilist.remove(ilist.size()-1));

        }
        return rlist;
    }
}