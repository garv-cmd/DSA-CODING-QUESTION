https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1//
class Tree{
     int maxLevel;
  
  public  void RightViewOfTree(Node node,ArrayList<Integer>al, int level) {
    if(node == null) {
      return;
    }
    
    if(level >= maxLevel) {
      al.add(node.data);
      maxLevel++;
    }
     RightViewOfTree(node.right,al, level + 1);
    RightViewOfTree(node.left,al, level + 1);
   
  }
  
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        maxLevel = 0;
       ArrayList<Integer> al = new  ArrayList<Integer>();
       if(root==null)
       return al;
      RightViewOfTree(root,al,0);
      return al;
    }
}
