//Leetcode - 257
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }
    
    private void dfs(TreeNode root, List<String> res, String path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
		    // leaf node
            path += root.val;
            res.add(path);
        }
        
        dfs(root.left, res, path + root.val + "->");
        dfs(root.right, res, path + root.val + "->");
    }
}
