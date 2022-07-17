 void PreOrder(binary<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.Left);
        PreOrder(root.Right);
    }
    void PreOrderIterative(binary<Integer> root) {
        Stack<binary> st = new Stack<>();
        if (root == null) return;
        st.push(root);
        while (!st.isEmpty()) {
            binary<Integer> node  = st.pop();
            System.out.print(node.data + " ");
            if (node.Right != null) {
                st.push(root.Right);
            }
            if (node.Left != null) {
                st.push(root.Left);
            }

        }
    }
}
