package am.sam;

public class Main {

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");

        Graph g = new Graph();

        g.nodes.add(A);
        g.nodes.add(B);
        g.nodes.add(C);
        g.nodes.add(D);
        g.nodes.add(E);
        g.nodes.add(F);
        g.nodes.add(G);

        A.addAdjacentNode(B);
        A.addAdjacentNode(E);
        A.addAdjacentNode(C);

        B.addAdjacentNode(D);
        B.addAdjacentNode(E);

        E.addAdjacentNode(D);

        C.addAdjacentNode(F);
        C.addAdjacentNode(G);

        g.breadthFirstTraversal(A);
        System.out.println();
        g.depthFirstTraversal(A);
    }
}
