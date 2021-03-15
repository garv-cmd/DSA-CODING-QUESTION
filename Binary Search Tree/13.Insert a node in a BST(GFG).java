 https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
 Node insert(Node root, int Key)
    {
        // your code here
        if(root==null){
            Node nn = new Node(Key);
            return nn;
        }
        if(root.data==Key){
            return root;
        }
        if(root.data < Key){
            root.right = insert(root.right,Key);
        }else{
            root.left = insert(root.left,Key);
        }
        return root;
    }
