void leafNode(binary<Integer> currentNode){
        ArrayList<Integer>arr =  new ArrayList<>();
        if(currentNode== null){
            return;
        }
        if(currentNode.left == null && currentNode.right== null){
         arr.add(currentNode.data);
         }
       leafNode(currentNode.left);
       leafNode(currentNode.right);

        for (Integer err:arr) {
            System.out.print(err+" ");

        }
    }
