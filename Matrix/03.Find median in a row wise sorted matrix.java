//https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1#
class Solution {
    int median(int matrix[][], int r, int c) {
        // code here        
        int arr[] = new int[r*c];
        int q=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[q++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[q/2];
    }
}
