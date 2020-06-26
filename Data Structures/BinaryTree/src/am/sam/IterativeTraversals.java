package am.sam;

import java.util.ArrayDeque;
import java.util.Stack;

public class IterativeTraversals {
    Node root;
    void preOrderIt() {
        Stack<Node> st = new Stack();
        Node curr;
        curr = root;

        if(curr != null) {
            st.push(curr);
        }

        while(!st.empty()) {
            curr = st.pop();
            System.out.print(curr.key + " ");

            if(curr.right != null) {
                st.push(curr.right);
            }

            if(curr.left != null) {
                st.push(curr.left);
            }
        }
    }
    void inOrderIt() {
        Stack<Node> st = new Stack();
        Node curr;
        curr = root;

        while(curr != null || !st.empty()) {
            while(curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.key + " ");

            curr = curr.right;
        }
    }
    void postOrder() {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        Node curr;
        curr = root;

        if(curr != null) {
            s1.push(curr);
        }

        while(!s1.empty()) {
            curr = s1.pop();

            if(curr.left != null) {
                s1.push(curr.left);
            }

            if(curr.right != null) {
                s1.push(curr.right);
            }

            s2.push(curr);
        }

        while(!s2.empty()) {
            curr = s2.pop();
            System.out.print(curr.key + " ");
        }
    }
    void levelTraversal() {
        ArrayDeque<Node> q = new ArrayDeque();
        Node curr;
        curr = root;
        if(curr != null) {
            q.add(curr);
        }

        while(!q.isEmpty()) {
            curr = q.getFirst();

            if(curr.left != null) {
                q.add(curr.left);
            }

            if(curr.right != null) {
                q.add(curr.right);
            }


            System.out.print(q.getFirst().key + " ");
            q.pop();
        }
    }
    void deleteDeepest(Node d_node) {
        Stack<Node> st = new Stack();
        Node curr = root;

        if(curr != null) {
            st.push(curr);
        }

        while (!st.isEmpty()) {
            curr = st.pop();
            if(curr.right == d_node) {
                curr.right = null;
                break;
            }
            else if(curr.right != null){
                st.push(curr.right);
            }

            if(curr.left == d_node) {
                curr.left = null;
                break;
            }
            else if(curr.left != null){
                st.push(curr.left);
            }
        }
    }
    void delete(int key) {
        if (root == null) {
            System.out.print("Empty Tree");
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.key == key) {
                root = null;
                return;
            }
        }

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);

        Node curr = null;
        Node key_node = null;

        // Do level order traversal to find deepest
        // node(temp) and node to be deleted (key_node)
        while (!q.isEmpty()) {
            curr = q.pop();

            if (curr.key == key) {
                key_node = curr;
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        if (key_node != null) {
            int temp = curr.key;
            deleteDeepest(curr);
            key_node.key = temp;
        }
    }
    void insert(int data) {
        Node curr;
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            curr = q.pop();

            /* Insert node as the left child of the parent node. */
            if(curr.left == null) {
                curr.left = new Node(data);
                break;
            }
            /* If the left node is not null push it to the queue. */
            else {
                q.add(curr.left);
            }

            /* Insert node as the right child of the parent node. */
            if(curr.right == null) {
                curr.right = new Node(data);
                break;
            }
            /* If the right node is not null push it to the queue. */
            else {
                q.add(curr.right);
            }
        }
    }
}
