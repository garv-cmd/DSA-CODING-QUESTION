//https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1#
class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(mat[i][j]);
            }
            
        }
        int res=0;
        while(k--!=0){
            res = pq.remove();
        }
        return res;
}
}
