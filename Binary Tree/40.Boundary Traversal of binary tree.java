https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1//
class Solution
{
    public void lb(Node node,ArrayList <Integer> al){
        if(node==null)
        return;
        if(node.left!=null || node.right!=null){
            al.add(node.data);
        }
        if(node.left!=null)
        lb(node.left,al);
        else if(node.right!=null)
        lb(node.right,al);
    }
      public void rb(Node node,ArrayList <Integer> al){
        if(node==null)
        return;
        if(node.right!=null)
        rb(node.right,al);
        else if(node.left!=null)
        rb(node.left,al);
      
        
        if(node.left!=null || node.right!=null){
            al.add(node.data);
        }
        
    }
    public void leafNode(Node node,ArrayList<Integer> al){
        if(node==null)
        return;
        leafNode(node.left,al);
        if(node.left==null && node.right==null)
        al.add(node.data);
        leafNode(node.right,al);
    }
	ArrayList <Integer> printBoundary(Node root)
	{
	    	ArrayList <Integer> al = new ArrayList <Integer>();
	    	if(root==null)
	    	return al;
	    	if(root.left==null && root.right==null)
	    	{
	    	    al.add(root.data);
	    	    return al;
	    	}
	    	al.add(root.data);
	    	lb(root.left,al);
	    	leafNode(root,al);
	    	rb(root.right,al);
	    	return al;
	    	
	}
}
