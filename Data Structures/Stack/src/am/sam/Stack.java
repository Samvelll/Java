package am.sam;

public class Stack {

    private Node head;

    public void push(int data) {
        Node new_node = new Node(data);

        if(this.head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    public Node pop() {
        if(this.head == null) {
            System.out.println("Empty Stack");
            return null;
        }
        else {
            Node node = head;
            head = head.next;
            return node;
        }
    }
    public Node peek() {
        return head;
    }
    public boolean isEmpty() {
        if(this.head == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public int size() {
        Node curr = head;
        int size = 0;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
