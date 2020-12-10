import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> f = new ArrayList<>();
            f.add("");
            return f;
        }
        if(n<0){
             ArrayList<String> f = new ArrayList<>();
         
            return f;
        }
        
        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);
        ArrayList<String> res = new ArrayList<>();
        for(String s:p1){
            res.add(1+s);
        }
            for(String s:p2){
            res.add(2+s);
        }
            for(String s:p3){
            res.add(3+s);
        }
        return res;
        
    }

}
