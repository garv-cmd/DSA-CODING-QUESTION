//leetcode - 344
class Solution {
    public void reverseString(char[] s) {
        
        for(int i=0;i<s.length/2;i++){ 
            int high = s.length-1-i; 
            char temp = s[high]; 
            s[high] = s[i];
            s[i]  =temp;
        }
 
    }
}
