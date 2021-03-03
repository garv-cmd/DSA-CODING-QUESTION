Leetcode - 1365
import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        SortedMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int sum=0,prev=0;
        for(int key:map.keySet()){
            int freq = map.get(key);
            sum+=prev;
            map.put(key,sum);
            prev = freq;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
        
    }
}

 
