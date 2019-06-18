package question255;

import java.util.Stack;

class Solution {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> stack = new Stack();
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[i] < min) return false;
            while (!stack.isEmpty() && preorder[i]>stack.peek()){
                stack.pop();
            }
            stack.push(preorder[i]);
        }
        return true;
    }
}