//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#
class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
       boolean check = true;
     public int height(Node node){
         if(node==null)
         return 0;
         int ln = height(node.left);
         int rn = height(node.right);
         if(ln-rn>1 || rn-ln>1)
         check=false;
         
         return 1+Math.max(ln,rn);
     }
    boolean isBalanced(Node root)
    {
	      
	       int c= height(root);
	       boolean res = check;
	       check = true;
	        return res;
    }
}
