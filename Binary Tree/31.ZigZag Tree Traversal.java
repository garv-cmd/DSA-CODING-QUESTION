//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    if(root==null)
	    return al;
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    s1.push(root);
	    
	    while(!s1.isEmpty() || !s2.isEmpty()){
	          while(!s1.isEmpty()){
	            Node top = s1.pop();
	            al.add(top.data);
	            if(top.left!=null)
	            s2.push(top.left);
	            
	            if(top.right!=null)
	            s2.push(top.right);
	        }
	         while(!s2.isEmpty()){
	            Node top = s2.pop();
	            al.add(top.data);
	            if(top.right!=null)
	            s1.push(top.right);
	            if(top.left!=null)
	            s1.push(top.left);
	            
	            
	        }
	      
	        
	    }
	    return al;
	    
	    
	    
	    
	}
}
