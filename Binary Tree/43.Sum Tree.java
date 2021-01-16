//https://practice.geeksforgeeks.org/problems/sum-tree/1#
class Tree
{
     boolean check = true;
    public int ch(Node root){
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return root.data;
       int l= ch(root.left);
       int r= ch(root.right);
       if(root.data!=(l+r)){
       check=false;
           return -1;
       }
       return root.data+l+r;
    }
    
	boolean isSumTree(Node root)
	{
             // Your code here
             
            check = true;
              ch(root);
              return check;
	}
}
