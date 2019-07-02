package question155;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack = new Stack();
    private Stack<Integer> minStack = new Stack();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        if (!minStack.isEmpty()) {
            if (minStack.peek() > x) {
                minStack.pop();
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }

        stack.push(x);

    }

    public void pop() {
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.pop();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */