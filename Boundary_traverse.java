 void Bondary(binary<Integer> root){
       Queue<binary> que = new LinkedList<>();
       ArrayList<Integer> arr1 = new ArrayList<>();
       ArrayList<Integer> arr2 = new ArrayList<>();
       ArrayList<Integer> arr3 = new ArrayList<>();
       que.add(root);
        arr1.add(root.data);
        arr2.add(root.data);
       while(!que.isEmpty()){

               binary<Integer> node = que.poll();
               while(node.left != null){
                   que.add(node.left);
                   arr1.add(node.left.data);
                   que.poll();
                   node=node.left;

               }
               node = root;
               while(node.right != null){
                   que.add(node.right);
                   arr2.add(node.right.data);
                   que.poll();
                   node= node.right;
               }
           que.add(root);
           while (!que.isEmpty()) {

                   binary<Integer> val = que.poll();
                   if(val.right == null && val.left ==null) {
                     arr3.add(val.data);
                   }
                   if (val.left != null) {
                       que.add(val.left);
                   }
                   if (val.right != null) {
                       que.add(val.right);
                   }
           }
       }
        System.out.println("Left Boundary " + arr1 + "\n" + " Leaf Level " + arr3 + "\n" + "Right Boundary" + arr2);
    }
