//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
class Tree
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		return null;
		if(root.data==n1 || root.data==n2){
		    return root;
		}
		Node l = lca(root.left,n1,n2);
		Node r = lca(root.right,n1,n2);
		if(l!=null && r!=null)
		return root;
		if(l!=null)
		return l;
		if(r!=null)
		return r;
		return null;
	}
}

