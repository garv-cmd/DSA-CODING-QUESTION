//https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1#
class Solution{
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int lo=0,hi=n-1;
            while(lo<hi){
                int t=matrix[lo][i];
                matrix[lo][i]=matrix[hi][i];
                matrix[hi][i]=t;
                lo++;hi--;
            }    
        }
        
    }
