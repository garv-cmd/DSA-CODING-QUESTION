//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
       int max = arr[0];
int curr = arr[0];

for (int i = 1; i < n; i++)
{
    if(curr >= 0){
        curr+=arr[i];
    }else{
        curr = arr[i];
    }
    if(curr > max){
        max = curr;
    }
    


}
return max;


        
    }
    
}
