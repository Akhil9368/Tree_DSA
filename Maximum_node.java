void maximum(binary<Integer> root) {
        int max = Integer.MIN_VALUE;
        Stack<binary> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        while (!s1.empty()) {
            root = s1.pop();
            s2.push(root.data);
            if (root.left != null) {
                s1.push(root.left);
            }
            if (root.right != null) {
                s1.push(root.right);
            }
        }
