package question226;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        List<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            int size = nodeList.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodeList.remove(0);
                TreeNode tempNode = curNode.left;
                curNode.left = curNode.right;
                curNode.right = tempNode;
                if (curNode.left != null) {
                    nodeList.add(curNode.left);
                }
                if (curNode.right != null) {
                    nodeList.add(curNode.right);
                }
            }
        }
        return root;
    }
}
