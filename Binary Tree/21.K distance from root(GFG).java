//https://practice.geeksforgeeks.org/problems/k-distance-from-root/1
class Tree
{
     // Recursive function to print right view of a binary tree.
      ArrayList<Integer> al = new ArrayList<Integer>();
      
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          getAns(root,k);
          return al;
          
     }
    public void getAns(Node root,int k){
         if(root==null || k<0){
              return;
          }
          if(k==0){
              al.add(root.data);
          }
          getAns(root.left,k-1);
          getAns(root.right,k-1);
     }
}
