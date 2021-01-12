//https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1/?company[]=Amazon&company[]=Amazon&problemStatus=unsolved&page=1&query=company[]AmazonproblemStatusunsolvedpage1company[]Amazon
class Solution {
    String firstAlphabet(String S) {
        // code here
        if(S.length()==0)
        return "";
        String str="";
        str+=S.charAt(0);
        for(int i=1;i<S.length()-1;i++){
            if(S.charAt(i)==' '){
                str+=""+S.charAt(i+1);
            }
        }
        return str;
    }
};
