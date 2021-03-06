leetcode - 1302
class Solution {
    int sum;
    public int deepestLeavesSum(TreeNode root) {
        int height = getHeight(root);
        sum=0;
        getSum(root,height,0);
        return sum;
    }
    public void getSum(TreeNode root,int h,int s){
    if(root==null)
        return;
        s++;
        if(root.left==null && root.right==null && s==h){
            sum+=root.val;
        }
        getSum(root.left,h,s);
        getSum(root.right,h,s);
        s--;
    }
    
    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}
