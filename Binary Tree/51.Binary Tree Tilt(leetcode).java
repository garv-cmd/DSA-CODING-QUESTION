leetcode - 563
class Solution {
    int sum;
    public int findTilt(TreeNode root) {
        sum=0;
        tilt(root);
        return sum;
    }
    
    public int tilt(TreeNode root){
        if(root==null)
            return 0;
       int l= tilt(root.left);
       int r= tilt(root.right);
       sum += Math.abs(l - r); 
        return l + r + root.val;
        
    }
}
