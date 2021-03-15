https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1#
 Node binaryTreeToBST(Node root)
    {
       // Your code here
       if(root==null)
       return null;
       ArrayList<Integer> al = new ArrayList<>();
       getal(root,al);
       Collections.sort(al);
    //   for(int i:al)
    //   System.out.print(i+" ");
       convert(root,al);
       return root;
    }
    int i=0;
    void convert(Node root,ArrayList<Integer> al){
        if(root==null)
        return;
        
        convert(root.left,al);
        root.data = al.get(i);
        i++;
        convert(root.right,al);
    }
    
    void getal(Node root,ArrayList<Integer> al){
        if(root==null)
        return;
        
        getal(root.left,al);
        al.add(root.data);
        getal(root.right,al);
    }
