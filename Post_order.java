void PostOrder(binary<Integer> root){
        if(root == null){
            return;
        }
        PostOrder(root.Left);
        PostOrder(root.Right);
        System.out.print(root.data+" ");
    }
    void PostOrderIterative(binary<Integer> root){
             if(root == null){
                 return;
             }
             Stack<binary> st = new Stack<>();
             Stack<Integer> st1 = new Stack<>();
             st.push(root);
             while(!st.empty()){
                 binary<Integer> node = st.pop();
                 st1.push(node.data);
                 if(node.Left !=  null){
                     st.push(node.Left);
                 }
                 if(node.Right != null){
                     st.push(node.Right);
                 }
             }
             while(!st1.empty()){
                 System.out.print(st1.pop() + " ");
             }
    }
