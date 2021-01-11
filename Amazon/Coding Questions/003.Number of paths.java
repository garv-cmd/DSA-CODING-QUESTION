//https://practice.geeksforgeeks.org/problems/number-of-paths0926/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        if(m==1 || n==1)
        return 1;
        return numberOfPaths(m,n-1)+numberOfPaths(m-1,n);
    }
    
}
