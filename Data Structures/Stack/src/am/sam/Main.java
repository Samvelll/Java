package am.sam;

public class Main {

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(6);
        st.push(11);
        st.push(15);
        st.push(14);
        st.push(19);
        st.push(31);

        int size = st.size();
        System.out.println("Stack size: " + size);

        Node top = st.peek();
        if(top != null) {
            System.out.println("Stack top: " + top.data);
        }

        while(!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.data + " ");
        }


    }
}
