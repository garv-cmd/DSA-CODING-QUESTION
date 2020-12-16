//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
class Solution{
    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
    {
        // Write your code here.
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                pq.add(arrays[i][j]);
            }
        }
        ArrayList<Integer>al = new ArrayList<>();
        while(pq.size()>0){
            al.add(pq.remove());
        }
        return al;
        
    }
}
