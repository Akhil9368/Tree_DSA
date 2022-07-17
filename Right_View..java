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
