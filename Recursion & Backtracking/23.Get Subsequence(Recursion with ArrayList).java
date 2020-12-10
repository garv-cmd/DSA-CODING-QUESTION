import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> ss = gss(s);
        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
             ArrayList<String> empty = new ArrayList<>();
             empty.add("");
             return empty;
        }
        
        char c = str.charAt(0);
        String sub = str.substring(1);
        ArrayList<String>restSub = gss(sub);
        ArrayList<String> res = new ArrayList<>();
        
        for(String s:restSub){
            res.add(s);
            
        }
        for(String s:restSub){
            res.add(c+""+s);
            
        }
        return res;
    }

}
