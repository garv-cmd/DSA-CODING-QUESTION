//Leetcode - 38
class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String s = "11";
        for(int i=3;i<=n;i++){
            String t = "";
            s=s+"&";
            int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j-1)){
                    t=t+""+c;
                    t=t+s.charAt(j-1);
                    c=1;
                }else
                    c++;
            }
            s=t;
        }
        return s;
        
    }
}
