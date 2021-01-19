//Leetcode - 1431
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max)
                max = candies[i];
        }
        for(int i:candies){
            if(i+extraCandies >= max)
                al.add(true);
            else 
                al.add(false);
        }
            
        return al;
    }
}
