 void BST(binary<Integer> root){
        if(root== null){return;}
        Queue<binary> que = new LinkedList<>();

        que.add(root);
        while(!que.isEmpty()){
            binary<Integer> node = que.poll();
            System.out.print(node.data+" ");
            if(node.Left != null){que.add(node.Left);}
            if(node.Right != null){que.add(node.Right);}
        }
    }
