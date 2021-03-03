leetcode - 1221
  class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='R')
                c++;
            else c--;
            if(c==0){
                res++;
            }
        }
        return res;
    }
}
