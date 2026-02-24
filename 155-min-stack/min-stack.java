class MinStack {
    // Stack<Integer>stack;
    // Stack<Integer>minstack;
    Node head;
    Node head1;
    class Node{
        int data;
        Node next;
    Node(int val)
    {
    data=val;
    next=null;
    }
    }
    public MinStack() {
        // stack=new Stack<>();
        // minstack=new Stack<>();
        head=null;
        head1=null;
    }
    
    public void push(int val) {
        Node newNode1=new Node(val);
        Node newNode2=new Node(val);
        if(head==null)
        {
            head=newNode1;
        }
        else
        {
            newNode1.next=head;
            head=newNode1;
        }
        if(head1==null)
        {
            head1=newNode2;
        }
        else
        {
            if(head1.data>=newNode2.data)
            {
            newNode2.next=head1;
            head1=newNode2;
        }
        }
    }
    //     stack.push(val);
    //     if(minstack.isEmpty()||minstack.peek()>=val)
    //     {
    //         minstack.push(val);
    //     }
    // }
    public void pop() {
    //     if(stack.peek().equals(minstack.peek()))
    //     {
    //         minstack.pop();
    //     }
    //     stack.pop();
    // }
    if(head==null)
    {
        return;
    }
    if(head.data==head1.data)
    {
        head1=head1.next;
    }
    head=head.next;
    }
    
    public int top() {
        return head.data;
        //return stack.peek();
    }
    public int getMin() {
        return head1.data;
       // return minstack.peek();

    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */