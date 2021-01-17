//Leetcode - 118
class Solution {
    public List<List<Integer>> generate(int A) {
         List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> al;
       A++;
      
        for(int j=1;j<A;j++){
             int C=1;
            al = new ArrayList<>();
        for (int i = 1; i <= j; i++)
        {
            al.add(C);
            C = C * (j - i) / i;
        }
            res.add(al);
            
        }
        return res;
    }
}
