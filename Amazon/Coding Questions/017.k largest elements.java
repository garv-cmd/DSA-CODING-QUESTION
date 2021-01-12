//https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int res[] = new int[k];
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr)
        pq.add(i);
        
        int j=0;
        while(j!=k){
            res[j] = pq.remove();
            j++;
        }
        return res;
    }
}
