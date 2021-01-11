//https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon#
class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int start = 0;
    int end = n - 1;
      while(start < end){
        int mid = (start + end) / 2;
        if(arr[mid] >= arr[mid + 1]) end = mid;
        else start = mid + 1;
}
return arr[end];
    }
}
