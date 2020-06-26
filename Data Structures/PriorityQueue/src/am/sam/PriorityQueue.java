package am.sam;

public class PriorityQueue {
    Node head;

    Node peek() {
        System.out.println("Peeked data:" + " " + this.head.data);
        return this.head;
    }

    Node pop() {
        Node temp = this.head;
        this.head = this.head.next;
        System.out.println("Poped data:" + " " + temp.data);
        return temp;
    }

    void push(int data, int priority) {
        Node curr = head;

        Node newNode = new Node(data, priority);

        if(isEmpty()) {
            head = newNode;
            System.out.println("Pushed data:" + " " + newNode.data + " " + "Priority:" + " " + newNode.priority);
            return;
        }

        if (head.priority > priority) {
            newNode.next = head;
            head = newNode;
        }
        else {
            while (curr.next != null && curr.next.priority < priority) {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }
        System.out.println("Pushed data:" + " " + newNode.data + " " + "Priority:" + " " + newNode.priority);
    }

    boolean isEmpty() {
        return head == null;
    }
}
