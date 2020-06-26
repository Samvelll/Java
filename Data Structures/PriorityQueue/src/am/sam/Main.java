package am.sam;

public class Main {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        q.push(5, 2);
        q.push(6, 3);
        q.push(7, 0);
        q.pop();
        q.peek();
    }
}
