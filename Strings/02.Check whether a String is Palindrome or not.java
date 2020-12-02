//gfg - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
class Solution {
    int isPlaindrome(String S) {
        // code here
        StringBuilder sb = new StringBuilder(S);
	    sb.reverse();
	    String c = sb.toString();
	    if(S.equals(c))
	    return 1;
	    else return 0;
    }
};
