//gfg link  - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#
//someone pls share o(n) solution
class Solution {
    int getPairsCount(int[] a, int n, int k) {
        // code here
         // code here
    int count = 0;
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j] == k)
                        count++;
                }
            }
            return count;
    }
}
