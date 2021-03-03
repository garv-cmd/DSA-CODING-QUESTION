leetcode - 1672
  class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum=0;
        for(int i[]:accounts){
            sum=0;
            for(int val:i){
                sum+=val;
            }
            if(sum>max)
                max = sum;
        }
        return max;
    }
}
