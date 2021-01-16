https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1#//
class Tree{
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<>();
       
      
        getAns(root,res,al);
        return res;
    }
    public void getAns(Node root,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> al){
      if(root==null)
      return;
     
      
        if(root.left==null && root.right==null){
   al.add(root.data);
            res.add(new ArrayList(al));
      al.remove(al.size()-1);
      return;
        } 
          
       al.add(root.data);
         getAns(root.left,res,al);
        
         getAns(root.right,res,al);
      al.remove(al.size()-1);
          
    }
    
}
