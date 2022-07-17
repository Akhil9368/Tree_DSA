void Vertical_Order(binary<Integer> root){
       int distance =0;
       TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
       Vertical_Order_Helper(root,distance,map);
       // To traverse the map elements
       for(Map.Entry<Integer,ArrayList<Integer>> m :map.entrySet()){
           System.out.println(m.getKey() + " " + m.getValue());
       }

   }

    private void Vertical_Order_Helper(binary<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
         if(root == null)return;
         if(map.get(distance)==null){
             ArrayList<Integer> arr = new ArrayList<>();
             arr.add(root.data);
             map.put(distance,arr);
         }
         else
         {
             ArrayList<Integer> arr = map.get(distance);
             arr.add(root.data);
             map.put(distance,arr);
         }

         Vertical_Order_Helper(root.left,distance-1,map);
         Vertical_Order_Helper(root.right,distance+1,map);

    }
}
