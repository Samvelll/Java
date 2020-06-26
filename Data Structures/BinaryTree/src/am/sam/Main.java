package am.sam;

public class Main {

    public static void main(String[] args) {
        RecursiveTraversals rec = new RecursiveTraversals();
        IterativeTraversals it = new IterativeTraversals();

        rec.root = new Node(1);
        rec.root.left = new Node(2);
        rec.root.left.left = new Node(4);
        rec.root.left.left.left = new Node(7);
        rec.root.left.left.right = new Node(8);
        rec.root.right = new Node(3);
        rec.root.right.left = new Node(5);
        rec.root.right.right = new Node(6);
        rec.root.right.right.left = new Node(9);

        it.root = new Node(1);
        it.root.left = new Node(2);
        it.root.left.left = new Node(4);
        it.root.left.left.left = new Node(7);
        it.root.left.left.right = new Node(8);
        it.root.right = new Node(3);
        it.root.right.left = new Node(5);
        it.root.right.right = new Node(6);
        it.root.right.right.left = new Node(9);

        System.out.print("Recursive NLR: ");
        rec.preOrderRec();
        System.out.println();

        System.out.print("Recursive LNR: ");
        rec.inOrderRec();
        System.out.println();

        System.out.print("Recursive LRN: ");
        rec.postOrderRec();
        System.out.println();
        System.out.println();

        System.out.print("Iterative NLR: ");
        it.preOrderIt();
        System.out.println();

        System.out.print("Iterative LNR: ");
        it.inOrderIt();
        System.out.println();

        System.out.print("Iterative LRN: ");
        it.postOrder();
        System.out.println();

        System.out.print("levelTraversal: ");
        it.levelTraversal();
        System.out.println();

        it.delete(9);
        it.levelTraversal();
        System.out.println();

        it.delete(3);
        it.levelTraversal();
        System.out.println();

        it.delete(7);
        it.levelTraversal();
        System.out.println();

        it.delete(6);
        it.levelTraversal();
        System.out.println();

        it.delete(5);
        it.levelTraversal();
        System.out.println();

        it.delete(4);
        it.levelTraversal();
        System.out.println();

        it.delete(8);
        it.levelTraversal();
        System.out.println();

        it.delete(2);
        it.levelTraversal();
        System.out.println();

        it.delete(1);
        it.levelTraversal();

        it.delete(2);
        it.levelTraversal();


    }
}
