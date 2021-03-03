leetcode - 771
class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        for(int i=0;i<J.length();i++){
            char c = J.charAt(i);
            for(int j=0;j<S.length();j++){
                if(c == S.charAt(j))
                    res++;
            }
        }
        return res;
    }
}
