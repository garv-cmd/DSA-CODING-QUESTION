leetcode - 124
  class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    
    private int helper(TreeNode root) {
        if (root == null) return 0;
        
        int leftMax = helper(root.left);
        int rightMax = helper(root.right);
        
        int pickLeft = leftMax + root.val;
        int pickRight = rightMax + root.val;
        int pickBoth = leftMax + rightMax + root.val;
        int pickNothing = root.val;
        
        int sum = Math.max(pickLeft, Math.max(pickRight, Math.max(pickBoth, pickNothing)));
        ans = Math.max(ans, sum);
        
        if (sum == pickNothing) return root.val;
        return Math.max(leftMax + root.val, rightMax + root.val);
    }
}
