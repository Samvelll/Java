package am.sam;

public class LinkedList {

    Node head;

    public void insert(int data) {
        Node new_node = new Node(data);

        if (this.head == null) {
            this.head = new_node;
        }
        else {
            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = new_node;
        }
    }

    public  void print() {
        Node curr = this.head;

        System.out.print("LinkedList: ");

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("\n");
    }

    public void deleteByKey(int key) {
        if (head != null && head.data == key) {
            head = head.next;
            System.out.println(key + " is found and deleted");
            return;
        }

        Node curr = head.next, prev = head;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            System.out.println(key + " is found and deleted");
        }
        else {
            System.out.println(key + " is not found");
        }
    }

    public void  deleteAtPosition(int index) {
        if (index == 0 && head != null) {
            head = head.next;
            System.out.println(index + " position element deleted");
        }

        Node curr = head.next, prev = head;

        int counter = 1;

        while (curr != null) {

            if (counter == index) {
                prev.next = curr.next;
                System.out.println(index + " position element deleted");
                break;
            }
            else {
                prev = curr;
                curr = curr.next;
                counter++;
            }
        }

        if (curr == null) {
            System.out.println(index + " position element not found");
        }
    }

}
