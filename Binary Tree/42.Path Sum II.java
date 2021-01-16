//Leetcode - 113
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        helper(root, sum, cur, result);
        return result;
    }
    
    private void helper(TreeNode root, int sum, List<Integer> cur, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null && sum - root.val == 0) {
            cur.add(root.val);
            result.add(new ArrayList(cur));
            cur.remove(cur.size() - 1);
            return;
        }
        
        cur.add(root.val);
        helper(root.left, sum - root.val, cur, result);
        helper(root.right, sum - root.val, cur, result);
        cur.remove(cur.size() - 1);
    }
}
