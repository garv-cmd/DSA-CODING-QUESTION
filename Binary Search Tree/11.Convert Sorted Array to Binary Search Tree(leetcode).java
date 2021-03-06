leetcode - 108
  class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int beg = 0;
        int end = nums.length-1;
        return bst(nums,beg,end);
    }

    public TreeNode bst(int []nums,int beg,int end){
        if(beg>end)
            return null;
        int mid = (beg+end)/2;
        TreeNode root = new TreeNode(nums[mid],null,null);
        root.left = bst(nums,beg,mid-1);
        root.right = bst(nums,mid+1,end);
        return root;
    }
    

}
