leetcode - 98
class Solution {
    ArrayList<Integer> al;
    public boolean isValidBST(TreeNode root) {
        al =  new ArrayList<>();
        inorder(root);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1))
                return false;
        }
        return true;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
       
        inorder(root.left);
         al.add(root.val);
        inorder(root.right);
        
    }
}
