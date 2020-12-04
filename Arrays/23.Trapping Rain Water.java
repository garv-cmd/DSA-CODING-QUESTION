//leetcode - 42
//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1/?category[]=Arrays&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=1&query=category[]Arrayscompany[]AmazonproblemStatusunsolvedproblemTypefunctionalpage1#
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
