https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1
 ArrayList<Integer>al;
    public List<Integer> merge(Node a,Node b)
    {
        // Write your code here
        al = new ArrayList<>();
        inorder(a);
        inorder(b);
        Collections.sort(al);
        return al;
        
    }
    void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
