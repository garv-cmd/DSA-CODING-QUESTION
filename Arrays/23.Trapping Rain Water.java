//leetcode - 42
class Solution {
    public int trap(int[] height) {
     
        if(height.length==0)
            return 0;
        int level = 0,res=0,l=0,r=height.length-1;
        while(l<r){
            int lower = height[height[l] < height[r] ? l++:r--];
            level = Math.max(lower,level);
            res+=level-lower;
        }
        return res;
        
    }
}
