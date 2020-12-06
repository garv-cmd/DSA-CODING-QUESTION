//https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int count = 0;
        int MAX = 0;
	    int maxCol = -1;
	    for(int i=0;i<n;i++){
	        count=0;
	        for(int j=0;j<m;j++){
	            if(arr[i][j]==1)
	            {
	                count++;
	            }
	            if(count>MAX)
	            {
	                MAX = count;
	                maxCol = i;
	            }
	        }
	    }
	    return maxCol;
    }
}
