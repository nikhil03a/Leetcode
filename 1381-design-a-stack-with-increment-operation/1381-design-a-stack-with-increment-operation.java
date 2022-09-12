class CustomStack {
    int[] stack;
    int top = -1;
    int max;
    public CustomStack(int maxSize) {
        max = maxSize;
        stack = new int[maxSize];
    }
    
    public void push(int x) {
        if(top == max-1 )
            return;
        else
            stack[++top]=x;
    }
    
    public int pop() {
        if(top==-1)
            return -1;
        else
            return stack[top--];
    }
    
    public void increment(int k, int val) {
        int temp = (top>=k) ? k : top+1;
        for(int i = 0; i<temp; i++)
            stack[i]+=val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */