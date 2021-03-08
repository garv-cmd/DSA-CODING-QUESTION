class Tree{
    // return the head of the DLL and remove those node from the tree as well.
    Node prev=null;
    Node head=null;
    public Node convertToDLL(Node root)
    {
        convertToDLLUtil(root);
        return head;
    }
    
    public Node convertToDLLUtil(Node root){
        if(root==null)
            return null;
        if(root.left==null&&root.right==null){
            if(prev==null){
                prev=root;
                head=root;
            }
            else{
                prev.right=root;
                root.left=prev;
                prev=root;
            }
            return null;
        }
        root.left=convertToDLLUtil(root.left);
        root.right=convertToDLLUtil(root.right);
        
        return root;
    }
    
}
