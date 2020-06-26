package am.sam;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(12);
        q.enQueue(13);
        q.enQueue(15);
        q.enQueue(5);
        q.enQueue(9);
        q.enQueue(20);
        q.enQueue(11);

        q.print();
        System.out.println("front: " + q.front().data);
        System.out.println("rear: " + q.rear().data);
        System.out.println("size: " + q.size());

        q.deQueue();
        q.print();
        q.deQueue();
        q.print();
        System.out.println("front: " + q.front().data);
        System.out.println("rear: " + q.rear.data);
        System.out.println("size: " + q.size());
    }
}
