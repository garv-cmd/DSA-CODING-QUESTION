https://practice.geeksforgeeks.org/problems/get-minimum-squares0538/1
class Solution
{
    public int MinSquares(int n)
    {
        // Code here
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem = i-j*j;
                if(dp[rem]<min)
                min = dp[rem];
            }
            dp[i] = min+1;
        }
		return dp[n];
    }
}
