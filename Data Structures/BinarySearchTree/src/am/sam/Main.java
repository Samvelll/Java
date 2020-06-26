package am.sam;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(14);
        tree.insert(16);
        tree.insert(19);
        tree.insert(21);
        tree.insert(4);
        tree.insert(7);
        tree.insert(15);
        tree.insert(15);

        tree.inOrder();
        System.out.println();
        System.out.println("minimum value: " + tree.findMinimum().data);

        System.out.println("searched item: " + tree.search(33).data);
        System.out.println(tree.search(16).data);
        tree.inOrder();
        System.out.println();

        tree.delete(19);
        tree.delete(14);
        tree.inOrder();
    }
}
