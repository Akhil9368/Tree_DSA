void KthNode(binary<Integer> root,int k){
      Queue<binary> que = new LinkedList<>();
      int level =0;
      que.offer(root);
      while(!que.isEmpty()){
              int count = que.size();
              for(int i=0;i<count;i++){
               binary<Integer> node = que.poll();
               if(level == k ) {
                   System.out.print(node.data+" ");
               }
               if(node.left != null){
                   que.offer(node.left);
               }
               if(node.right != null){
                   que.offer(node.right);
               }
              }
          level++;
      }
  }
// Recursively
 void Kth_Node_Recursive(binary<Integer> root ,int level,int k){
        if(root == null){return;}
        if(level == k){
            System.out.print(root.data + " ");
        }
        Kth_Node_Recursive(root.left,level+1,k);
        Kth_Node_Recursive(root.right,level+1,k);
  }
