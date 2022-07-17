int maxlevel=0;
     void leftView(binary<Integer> root,int level){
        if(root == null){
        return ;
         }
     if(maxlevel<level){
       System.out.print(root.data + " ");
       maxlevel=level;
     }
     leftView(root.left,level+1);
     leftView(root.right,level+1);
   }
