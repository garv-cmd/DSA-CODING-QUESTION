leetcode - 1313
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int s =0;
        for(int i=0;i<nums.length;i=i+2){
            s+=nums[i];
        }
        int res[] = new int[s];
        int d=0;
        for(int i=0;i<nums.length-1;i=i+2){
            int c = nums[i];
            int n = nums[i+1];
            while(c--!=0){
                res[d++] = n;
            }
        }
        return res;
    }
}
