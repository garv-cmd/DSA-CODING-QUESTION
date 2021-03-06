leetcode - 606
class Solution {
    StringBuilder sb;
    public String tree2str(TreeNode t) {
        sb=new StringBuilder();
        getString(t);
        return sb.toString();
    }
    public void getString(TreeNode t){
        if(t != null) {
            sb.append(t.val);             
            
            if(t.left == null && t.right != null) {
                sb.append("(").append(")");               
            }
            
            if(t.left != null) {
                sb.append("(");
                getString(t.left);
                sb.append(")");
            }
            
            if(t.right != null) {
                sb.append("(");
                getString(t.right);
                sb.append(")");
            }          
        }
    }
}
