//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
class Tree
{
    int maxLevel;
  
  public  void leftViewOfTree(Node node,ArrayList<Integer>al, int level) {
    if(node == null) {
      return;
    }
    
    if(level >= maxLevel) {
      al.add(node.data);
      maxLevel++;
    }
    
    leftViewOfTree(node.left,al, level + 1);
    leftViewOfTree(node.right,al, level + 1);
  }
  
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      maxLevel = 0;
       ArrayList<Integer> al = new  ArrayList<Integer>();
       if(root==null)
       return al;
      leftViewOfTree(root,al,0);
      return al;
      
      
      
    }
   
}
