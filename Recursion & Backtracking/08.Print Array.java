//https://practice.geeksforgeeks.org/problems/print-elements-of-array4910/1
class Solution {
    void printArray(int arr[], int n) {
        //   code here
        if(n==0)
        return;
        printArray(arr,n-1);
        System.out.print(arr[n-1]+" ");
    }
}
