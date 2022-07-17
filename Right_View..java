 int max= 0;
   void Right_View(binary<Integer> root,int level){
         if(root == null){
             return;
         }
         if(max<level){
             System.out.print(root.data+ " ");
             max=level;
         }
         Right_View(root.right,level+1);
         Right_View(root.left,level+1);
   }
void Right_View_Iterative(binary<Integer> root){
       Queue<binary> Que = new LinkedList<>();
       if(root == null){
           return;
       }
       int count=0;
       Que.add(root);
       while (!Que.isEmpty()){
           count= Que.size();
           for(int i=0;i<count;i++) {
               binary<Integer> node = Que.poll();
               if(i==count-1)
                   System.out.print(node.data+" ");

               if (node.left != null)
                   Que.add(node.left);

               if (node.right != null)
                   Que.add(node.right);
           }
       }
   }
