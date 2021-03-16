https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1
class Solution
{
    // Return the minimum absolute difference between any tree node and the integer K
    static int maxDiff(Node  root, int K) 
    { 
        if(root==null)
        return Integer.MAX_VALUE;
        if(root.data==K)
        return 0;
        if(root.data < K){
            return Math.min(Math.abs(root.data-K),maxDiff(root.right,K));
        }else{
            return Math.min(Math.abs(root.data-K),maxDiff(root.left,K));
        }
        
        
    } 
}
