/*
1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
abc
output - 
abc
acb
bac
bca
cab
cba

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s,"");
    }

    public static void printPermutations(String str,String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i+1);
            String tot = leftPart+rightPart;
            
            printPermutations(tot,asf+ch);
        }
    }

}
