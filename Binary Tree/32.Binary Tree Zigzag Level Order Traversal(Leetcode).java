//Leetcode - 103
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         ArrayList<Integer> al = new ArrayList<Integer>();
         ArrayList<List<Integer>>res = new ArrayList<>();
	    if(root==null)
	    return res;
	    Stack<TreeNode> s1 = new Stack<>();
	    Stack<TreeNode> s2 = new Stack<>();
	    s1.push(root);
	    
	    while(!s1.isEmpty() || !s2.isEmpty()){
            
            al= new ArrayList<Integer>();
	          while(!s1.isEmpty()){
	            TreeNode top = s1.pop();
	            al.add(top.val);
	            if(top.left!=null)
	            s2.push(top.left);
	            
	            if(top.right!=null)
	            s2.push(top.right);
                  
	        }
               if(!al.isEmpty())
            res.add(al);
            al= new ArrayList<Integer>();
            
	         while(!s2.isEmpty()){
	            TreeNode top = s2.pop();
	            al.add(top.val);
	            if(top.right!=null)
	            s1.push(top.right);
	            if(top.left!=null)
	            s1.push(top.left);
	            
	            
	        }
            if(!al.isEmpty())
	       res.add(al);
            al= new ArrayList<Integer>();
           
	        
	    }
        
	    return res;
	    
        
    }
}
