package question173;

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

class BSTIterator {
    private List<TreeNode> list = new LinkedList<>();
    private TreeNode root;
    int idx = 0;

    public BSTIterator(TreeNode root) {
        this.root = root;
        inOrderTraverse(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        return list.get(idx++).val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return idx < list.size()?true:false;
    }
    
    private void inOrderTraverse(TreeNode root){
        if(root==null) return ;
        inOrderTraverse(root.left);
        list.add(root);
        inOrderTraverse(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */