//https://practice.geeksforgeeks.org/problems/number-of-paths0926/1/?category[]=Recursion&page=1&query=category[]Recursionpage1#
class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        if(m==1 || n==1)
        return 1;
        return numberOfPaths(m,n-1)+numberOfPaths(m-1,n);
    }
    
}
