leetcode - 1528
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            char ch = s.charAt(i);
            str.setCharAt(indices[i],ch);
        }
        return str.toString();
    }
}
