package am.sam;

public class Queue {

    Node front, rear;

    Node front() {
        return this.front;
    }

    Node rear() {
        return this.rear;
    }

    void print() {
        Node curr = front;

        System.out.print("Queue: ");
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    boolean isEmpty() {
        if(front == null) {
            return true;
        }

        return false;
    }

    int size() {
        Node curr = front;
        int size = 0;

        while(curr != null) {
            size++;
            curr = curr.next;
        }

        return size;
    }

    void enQueue(int data) {
        Node newNode = new Node(data);

        if(front == null) {
            front = newNode;
            rear = front;
            return;
        }

        rear.next = newNode;
        rear = rear.next;
    }

    void deQueue() {
        front = front.next;
    }
}
