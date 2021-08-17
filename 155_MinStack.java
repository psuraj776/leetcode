class MinStack {

    /** initialize your data structure here. */
    Stack<int[]> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            minStack.push(new int[]{val,val});
        }
        else{
            minStack.push(new int[]{val,Math.min(minStack.peek()[1],val)});
        }
    }
    
    public void pop() {
        if(!minStack.isEmpty()){
            minStack.pop();
        }
    }
    
    public int top() {
        return minStack.peek()[0];
    }
    
    public int getMin() {
        return minStack.peek()[1];
    }
}