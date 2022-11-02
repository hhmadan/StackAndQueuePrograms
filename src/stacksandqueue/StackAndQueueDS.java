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
    public void createStack(int data){
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
        st.createStack(56);
        st.createStack(30);
        st.createStack(70);

        st.getDisplay();

    }
}
