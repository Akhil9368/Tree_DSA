 void LeafNode(binary<Integer> root) {

        Stack<binary> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        while (!s1.empty()) {
            root = s1.pop();

            if (root.left != null) {
                s1.push(root.left);
            }
            if (root.right != null) {
                s1.push(root.right);
            }
            if(root.right == null && root.left == null){
                s2.push(root.data);
            }
        }
        while(!s2.empty()){
            System.out.print(s2.pop() + " ");
        }
    }
