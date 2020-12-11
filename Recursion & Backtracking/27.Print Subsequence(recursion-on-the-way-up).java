import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSS(s,"");
    }

    public static void printSS(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String sub = str.substring(1);
        printSS(sub,ans+ch);
        printSS(sub,ans+"");
        
    }

}
