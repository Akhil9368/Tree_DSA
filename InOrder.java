void InOrder(binary<Integer> root){
        if(root == null){
            return;
        }
        InOrder(root.Left);
        System.out.print(root.data+" ");
        InOrder(root.Right);
    }
    void InOrderIterative(binary<Integer> root){
        if(root == null)return;
        Stack<binary> st = new Stack<>();
        binary<Integer> temp = null;
        temp = root;

        while (temp!=null || !st.isEmpty()){
          while (temp !=null){
                st.push(temp);
                temp = temp.Left;
            }
          temp = st.pop();
          System.out.print(temp.data + " ");
           temp = temp.Right;

        }
    }
