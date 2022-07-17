 // Recursively....
int Height(binary<Integer> root) {
        if (root == null)
            return 0;
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
// iteratively...
 int Height1(binary<Integer> root) {
        if (root == null) return 0;
        Queue<binary> qu = new LinkedList<>();
        qu.add(root);
        int height = 0;
        int node1 = 1;
        while (!qu.isEmpty()) {
            int count = qu.size();
            for (int i = 0; i < count; i++) {
                binary<Integer> node = qu.poll();
                if (node.left != null) {
                    qu.add(node.left);
                    node1++;
                }
                if (node.right != null) {
                    qu.add(node.right);
                    node1++;
                }

            }
            height++;
        }
        System.out.println("The Total Numbers of Node " + node1);
        return height;
    }
