//Leetcode = 144
class Solution {
    List<Integer> al = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null)
        {
            al.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return al;
    }
}
