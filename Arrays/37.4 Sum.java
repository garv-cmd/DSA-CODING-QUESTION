//leetcode - 18
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int target2 = target-nums[i]-nums[j];
                int front = j+1;
                int back = n-1;
                while(front<back){
                    int twoSum = nums[front]+nums[back];
                    if(twoSum < target2){
                        front++;
                    }else if(twoSum > target2){
                        back--;
                    }else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                         while(front < back && nums[front]==quad.get(2)){
                        front++;
                    }
                        while(front < back && nums[back]==quad.get(3)){
                        back--;
                    }
                   
                    }
                     
                    
                }
                while(j+1<n && nums[j+1]==nums[j]){
                    j++;
                }
            }
            while(i+1<n && nums[i+1]==nums[i]){
                    i++;
                }
        }
        return res;
    }
}
