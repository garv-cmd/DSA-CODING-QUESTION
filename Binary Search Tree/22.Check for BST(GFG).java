  https://practice.geeksforgeeks.org/problems/check-for-bst/1
  ArrayList<Integer> al;
    boolean isBST(Node root)
        {
            
            al= new ArrayList<>();
            inorder(root);
            for(int i=0;i<al.size()-1;i++){
                if(al.get(i)>=al.get(i+1))
                return false;
            }
            return true;
            
            
        }
        void inorder(Node root){
            if(root==null)
            return;
            inorder(root.left);
            al.add(root.data);
            inorder(root.right);
        }
        
        
