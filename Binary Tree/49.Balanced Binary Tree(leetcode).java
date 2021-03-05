leetcode - 110
  
class Solution {
     public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) <= 1)
        {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        else return false;
    }
    
    public int getHeight(TreeNode root)
    {
        if(root==null) return 0;
        else return 1+ Math.max(getHeight(root.left),getHeight(root.right));
    }
}
