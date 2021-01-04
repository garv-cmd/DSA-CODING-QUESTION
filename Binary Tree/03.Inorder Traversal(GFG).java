//https://practice.geeksforgeeks.org/problems/inorder-traversal/1
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> al = new ArrayList<>();
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        if(root!=null){
            inOrder(root.left);
            al.add(root.data);
            inOrder(root.right);
        }
        return al;
    }
    
    
}
