https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1#
class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	     int res=0;
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            Integer max=null;
            for(int j=0;j<i;j++){
               if(arr[j]<arr[i]){
                    if(max==null)
                max = dp[j];
                else if(dp[j]>max)
                max = dp[j];
               }
            }
            if(max==null)
            dp[i] = arr[i];
            else dp[i] = max+arr[i];
            if(dp[i]>res)
            res = dp[i];
        }
       return res;
	}  
}
