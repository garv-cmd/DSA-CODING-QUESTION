//https://practice.geeksforgeeks.org/problems/count-the-zeros2550/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int c=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=1)
            c++;
            else break;
        }
        return c;
    }

}
