//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int cap, int wts[], int values[], int n) 
    { 
         // your code here 
         
        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++){
                int val = values[i - 1];
                int wt = wts[i - 1];

                if(j >= wt){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return (dp[n][cap]);
    } 
}
