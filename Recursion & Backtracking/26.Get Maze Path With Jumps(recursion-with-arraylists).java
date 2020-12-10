/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
       ArrayList<String> res = getMazePaths(1,1,r,c);
       System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(dr==sr && sc==dc){
            ArrayList<String> reach = new ArrayList<>();
            reach.add("");
            return reach;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        //horizontally
        for(int s=1;s<=dc-sc;s++){
            ArrayList<String> h = getMazePaths(sr,sc+s,dr,dc);
            for(String hpath:h){
                paths.add("h"+s+hpath);
            }
        }
        //vertically
         for(int s=1;s<=dr-sr;s++){
            ArrayList<String> v = getMazePaths(sr+s,sc,dr,dc);
            for(String vpath:v){
                paths.add("v"+s+vpath);
            }
        }
        
          //vertically
         for(int s=1;s<=dr-sr && s<=dc-sc;s++){
            ArrayList<String> d = getMazePaths(sr+s,sc+s,dr,dc);
            for(String dpath:d){
                paths.add("d"+s+dpath);
            }
        }
        return paths;
        
    }

}
