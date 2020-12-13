//https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                al.add(arr[i]);
            }
        }
        return al;
    }
}
