package am.sam;

public class RecursiveTraversals {

    Node root;

    public void preOrderRec() {
        preOrderRec(this.root);
    }

    public void inOrderRec() {
        inOrderRec(this.root);
    }

    public void postOrderRec() {
        postOrderRec(this.root);
    }

    private void preOrderRec(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.key + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    private void inOrderRec(Node root) {
        if(root == null) {
            return;
        }

        inOrderRec(root.left);
        System.out.print(root.key + " ");
        inOrderRec(root.right);
    }

    private void postOrderRec(Node root) {
        if(root == null) {
            return;
        }

        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.key + " ");
    }
}
