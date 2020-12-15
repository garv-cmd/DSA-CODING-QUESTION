//https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1#
class Solution {
    long countStrings(int n) {
        // code here
        long oc1 = 1;
        long oc0 = 1;
        for(int i=2;i<=n;i++)
        {
            long nc1 = oc1%1000000007;
            long nc0 = oc0%1000000007;
            
            nc1 = oc0%1000000007;
            nc0 = (oc1+oc0)%1000000007;
            
            oc1 = nc1%1000000007;
            oc0 = nc0%1000000007;
        }
        return (oc1+oc0)%1000000007;
        
    }
}
