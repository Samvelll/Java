package am.sam;

public class Main {

    public static void main(String[] args) {
        Heap h = new Heap(11);

        h.insertKey(3);
        h.insertKey(2);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);
        h.insertKey(6);
        h.insertKey(1);
        h.deleteKey(2);

        h.print();

        h.deleteMin();
        System.out.println();
        h.print();
        System.out.println();
        System.out.println(h.getMin());
        h.decreaseKey(2, 1);
        System.out.println(h.getMin());
        h.print();
    }
}
