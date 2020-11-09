//Leetcode - 31
class Solution {
    public void nextPermutation(int[] nums) {
        //traverse from back -> 1 3 5 4 2
        //a[i] < a[i+1] -> index 1 ->3
        //find index which has value greater than index 1
        //a[index 3] > a[index 1]
        //swap  a[index 3] , a[index 1] // 1 4 5 3 2
        //reverse everything from right of index1+1 -> 1 4 2 3 5
        
        if(nums.length <= 1 || nums==null)
            return ;
        int i = nums.length-2;
        while( i>=0 && nums[i] >= nums[i+1])
            i--;
        
        //if we got the breakpoints
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i])
                j--;
            swap(nums,i,j);
            
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void swap(int arr[] , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}
