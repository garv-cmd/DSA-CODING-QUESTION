//https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1#
class Tree {
    /*you are required to complete this function */
    int s=0;
    boolean hasPathSum(Node root, int S) {
        if(root==null || S<0)
        return false;
        if(root.left==null && root.right==null && root.data==S){
           
            return true;
        }
        s+=root.data;
        boolean l = hasPathSum(root.left,S-root.data);
       
        boolean r = hasPathSum(root.right,S-root.data);
        return l||r;
    }
}
