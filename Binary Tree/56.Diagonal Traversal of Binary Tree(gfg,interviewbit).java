
class Tree
{
    
    TreeMap<Integer,ArrayList<Integer>> map;
     public ArrayList<Integer> diagonal(Node root)
      {
           ArrayList<Integer>res = new ArrayList<>();
           map = new TreeMap<>();
           getAns(root,1);
            for(int k : map.keySet()){
            for(int val:map.get(k))
            res.add(val);
        }
           return res;
      }
      public void getAns(Node root,int d){
          if(root==null)
          return;
          
          if(map.containsKey(d)){
                ArrayList<Integer> a = map.get(d);
                a.add(root.data);
                map.put(d,a);
            }else{
                 ArrayList<Integer> a = new ArrayList<>();
                a.add(root.data);
                map.put(d,a);
            }
            
            getAns(root.left,d+1);
            getAns(root.right,d);
            
      }
}
