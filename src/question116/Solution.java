package question116;


import java.util.LinkedList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        List<Node> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            int size = list.size();
            List<Node> ilist = new LinkedList<>();
            for(int i = 0;i < size;i++){
                
                Node node = list.remove(0);
                if(list.isEmpty()){
                   node.next = null;
                }else{
                   node.next = list.get(0);//注意这个时候不能调用remove，所以要使用get
                }
                
                if(node.left!=null){
                    ilist.add(node.left);
                }
                if(node.right!=null){
                    ilist.add(node.right);
                }
            }
            list = new LinkedList(ilist);//必须有，否则list就杯改变了，30行就出问题了
        }
        return root;
    }
}