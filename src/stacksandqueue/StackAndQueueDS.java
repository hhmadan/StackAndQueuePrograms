package stacksandqueue;

public class StackAndQueueDS {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public StackAndQueueDS(){
        this.top = null;
    }
    public void push(int data){
        Node node = new Node(data);
        if(top==null){
            node.next = null;
        }
        else {
            node.next = top;
        }
        top = node;
    }

    public void getDisplay(){
        Node tmp = top;
        while(tmp != null)
        {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
    }
    public void peek(){
        if(top == null){
            System.out.println("This Stack is Empty");
        }
        System.out.println("\nTop Element of Stack is: "+top.data);
    }
    public void pop(){
        if(top == null){
            System.out.println("This Stack is Empty");
        }
        System.out.println("\nPopped Element of Stack is: "+top.data);
        top = top.next;
    }
    public void checkEmpty(){
        while(top != null){
            peek();
            pop();
        }
        System.out.println("Stack is Empty");
    }

    public static void main(String[] args) {
        StackAndQueueDS st = new StackAndQueueDS();
        st.push(70);
        st.push(30);
        st.push(56);

        st.getDisplay();
        st.peek();
        st.pop();
        st.checkEmpty();
    }
}
