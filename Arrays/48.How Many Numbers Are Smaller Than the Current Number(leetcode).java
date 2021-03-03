leetcode - 1365
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int c;
        for(int i=0;i<nums.length;i++){
            c=0;
            int n = nums[i];
            for(int j=0;j<nums.length;j++){
                if(n > nums[j])
                    c++;
            }
            arr[i] = c;
                    
        }
        return arr;
    }
}
