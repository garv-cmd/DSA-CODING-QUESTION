leetcode - 1512
  class Solution {
    public int numIdenticalPairs(int[] A) {
         int res = 0;
        int count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}
