leetcode - 1379
class Solution {
    TreeNode ans = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        getAns(original,cloned,target);
        return ans;
    }
     public final void getAns(final TreeNode original, final TreeNode cloned, final TreeNode target){
        if(original!=null){
           if(original==target){
               ans = cloned;
               return;
           }
            getAns(original.left,cloned.left,target);
            getAns(original.right,cloned.right,target);
        }
     }
}

   
        
    
