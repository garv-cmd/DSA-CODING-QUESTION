//https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1#
class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        for(int k=0;k<matrix.length;k++){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    if(matrix[i][k]!=-1 && matrix[k][j]!=-1&& matrix[i][k]+matrix[k][j] < matrix[i][j]){
                        matrix[i][j] = matrix[i][k]+matrix[k][j];
                    }
                }
            }
        }
    }
}
