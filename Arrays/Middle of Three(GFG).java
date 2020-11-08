//https://practice.geeksforgeeks.org/problems/middle-of-three2926/1
class Solution{
    int middle(int A, int B, int C){
        //code here
      
        
        int max = Math.max(Math.max(A,B),C);
        int min = Math.min(Math.min(A,B),C);
        
        if(A < max && A > min){
            return A;
        }else if( B < max && B > min ){
            return B;
        }else return C;
        
    }
}
