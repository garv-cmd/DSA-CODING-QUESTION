leetcode - 112
class Solution {
    boolean check;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        rtl(root,targetSum,0);
        return check;
        
    }
    
    public void rtl(TreeNode root, int targetSum,int s){
        if(root == null)
            return;
        s+=root.val;
        if(root.left==null && root.right==null && s==targetSum){
            check = true;
            return;
        }
        rtl(root.left,targetSum,s);
        rtl(root.right,targetSum,s);
    }
    
}
