package am.sam;

public class BST {
    Node root;
    void inOrder() {
        inOrder(this.root);
    }
    void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    Node findMinimum() {
        Node curr = root;
        while(curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
    void insert(int data) {
        Node new_node = new Node(data);
        Node curr = root;

        if (root == null) {
            root = new_node;
            return;
        }
        while((data < curr.data && curr.left != null) || (data > curr.data && curr.right != null)) {
            if(data < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }

        if(data < curr.data) {
            curr.left = new_node;
        }
        else if(data > curr.data) {
            curr.right = new_node;
        }
    }
    Node search(int data) {
        Node curr = root;
        while (curr != null && curr.data != data) {
            if (data < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
        if(curr != null) {
            return curr;
        }
        else {
            System.out.println("the data is not present");
            return root;
        }
    }
    void delete(int item) {
        Node parent = root;
        Node curr = root;

        //empty tree
        if (root == null) {
            return;
        }

        curr = search(item); //jnjman entaka node-y
        if(curr != root) { //jnjman entaka node-i parent
            while (true) {
                if (parent.left == curr || parent.right == curr) {
                    break;
                }
                if (item < parent.data) {
                    parent = parent.left;
                } else {
                    parent = parent.right;
                }
            }
        }

        //case 1: leaf node
        if (curr.left == null && curr.right == null) {
            if (curr != root) {
                if(parent.left == curr) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            else {
                root = null;
            }
        }
        //case 2: two children
        else if (curr.left != null && curr.right != null) {
            Node succ = curr.right;
            Node parentSucc = curr;
            //case when right child of deleted element doesn't have left node
            if(succ.left == null) {
                curr.data = succ.data;
                curr.right = succ.right;
                return;
            }
            //finding minimum in right subtree
            while(succ.left != null) {
                parentSucc = succ;
                succ = succ.left;
            }
            curr.data = succ.data;
            parentSucc.left = null;
        }
        //case 3: one child
        else {
            Node child = (curr.left != null)?curr.left: curr.right;

            if (curr != root) {
                if (curr == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else {
                root = child;
            }
        }
    }
}
