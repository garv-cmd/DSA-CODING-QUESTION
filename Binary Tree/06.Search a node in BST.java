//https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1
class BST
{
    boolean search(Node root, int x)
    {
	    // Your code here
	    if(root==null)
	    return false;
	    if(root.data==x)
	    return true;
	    
	    boolean s = search(root.left,x);
	    if(s==true)
	    return true;
	    boolean q = search(root.right,x);
	    if(q==true)
	    return true;
	    return false;
    }
}
