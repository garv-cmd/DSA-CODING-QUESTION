//leetcode - 74
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0 )
            return false;
        int l1 = matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
           if(target==matrix[i][l1])
               return true;
            else if(target<matrix[i][l1]){
               
                    int l = 0;
                    int h = l1;
                    while(l<=h){
                        int mid = matrix[i][(l+h)/2];
                        if(mid == target)
                            return true;
                        else if(mid > target)
                            h--;
                        else l++;
                    }
                    
                
                break;
            }
           
        }
        return false;
    }
}
