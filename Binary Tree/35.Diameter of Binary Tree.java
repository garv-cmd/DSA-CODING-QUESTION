//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1#
class Tree {
    /* Complete the function to get diameter of a binary tree */
    static int d=0;
    static int height(Node node){
        if(node==null)
        return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        if(1+lh+rh>d)
        d=1+lh+rh;
        return 1+Math.max(lh,rh);
    }
    int diameter(Node root) {
        // Your code here
       
        height(root);
        int res=d;
        d=0;
        return res;
    }
}
