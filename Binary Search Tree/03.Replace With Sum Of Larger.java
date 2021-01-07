/*
1. You are given a partially written BST class.
2. You are required to complete the body of rwsol function. "rwsol" function is expected to replace a node's value with sum of all nodes greater than it.
*/

static int sum = 0;
    public static void rwsol(Node node) {
        // write your code here
        if(node==null)
        return;
        
        rwsol(node.right);
        int od = node.data;
         node.data = sum;
        sum+=od;
       
        rwsol(node.left);
        
    }
