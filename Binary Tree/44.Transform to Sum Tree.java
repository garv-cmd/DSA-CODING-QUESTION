//https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1
class Tree{
    public void toSumTree(Node root){
         //add code here.
         getAns(root);
    }
    public int getAns(Node root){
        if(root==null){
            return 0;
        }
        int l  = getAns(root.left);
        int r  = getAns(root.right);
        int val = l+r+root.data;
        root.data = l+r;
        return val;
    }
}
