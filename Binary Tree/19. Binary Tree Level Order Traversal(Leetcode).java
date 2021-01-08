//Leetcode - 102
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        ArrayList<Integer>al = new ArrayList<>();
        ArrayList<List<Integer>>res = new ArrayList<>();
        if(node==null){
            return res;
        }
         Queue < TreeNode > mq = new ArrayDeque < > ();
        mq.add(node);

        while (mq.size() > 0) {
            int cicl = mq.size();

            for (int i = 0; i < cicl; i++) {
                node = mq.remove();
                al.add(node.val);

                if (node.left != null) {
                    mq.add(node.left);
                }

                if (node.right != null) {
                    mq.add(node.right);
                }
            }

            res.add(al);
            al=new ArrayList<>();
    }
        return res;
    }
}
