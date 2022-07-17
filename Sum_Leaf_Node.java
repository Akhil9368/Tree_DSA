void LeafNodeSum(binary<Integer> root) {

        Stack<binary> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        int sum =0;
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
           sum=sum+s2.pop();
        }
        System.out.println(sum);
    }
