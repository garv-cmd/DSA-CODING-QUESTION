leetcode - 1470
  class Solution {
    public int[] shuffle(int[] nums, int n) {
        int pos1 = 0,pos2 = n,i = 0;
        int[] res = new int[2*n];
        while(i<(2*n))
        {
            res[i++]=nums[pos1++];
            res[i++]=nums[pos2++];
        }
       return res; 
    }
}v
