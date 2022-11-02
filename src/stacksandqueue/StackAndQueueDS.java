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
    Node top = null;
    public void createQueue(int data){
        Node node = new Node(data);
        if(top==null){
            top = node;
        }
        else {
            Node tmp = top;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }
    public void deque(){
        Node tmp = top;
        if(tmp != null){
            int dVal = top.data;
            System.out.println("The Value dequeued is: "+dVal);
            top = top.next;
        }
    }

    public void getDisplay(){
        Node tmp = top;
        while(tmp != null)
        {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        StackAndQueueDS st = new StackAndQueueDS();
        st.createQueue(56);
        st.createQueue(30);
        st.createQueue(70);

        st.getDisplay();
        System.out.println();
        st.deque();
        st.getDisplay();

    }
}
