 void Diagonal(binary<Integer> root) {
        Queue<binary<Integer>> que = new LinkedList<>();
        que.add(root);
        while (que.size() != 0) {
            int size = que.size();
            while (size > 0) {
                binary<Integer> node = que.poll();
                while (node != null) {
                    if (node.left != null) {
                        que.add(node.left);
                    }
                    System.out.print(node.data + " ");
                    node = node.right;
                }
                size--;
            }
            System.out.println();
        }
    }
