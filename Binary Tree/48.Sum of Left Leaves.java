//Leetcode -404
class Solution {
    private int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return sum;
    }
    
    private void helper(TreeNode root, boolean isLeft){
        if(root == null)
            return;
        if(root.left == null && root.right == null && isLeft == true)
            sum += root.val;
        helper(root.left, true);
        helper(root.right, false);
    }
}
