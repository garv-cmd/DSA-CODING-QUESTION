/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.
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
    //  if(sr > dr || sc > dc){
    //         return new ArrayList<>();
    //     }

     if(sr==dr && sc==dc){
         ArrayList<String> reach = new ArrayList<>();
         reach.add("");
         return reach;
     }
       ArrayList<String> h1 = new ArrayList<>();
        ArrayList<String> v1 = new ArrayList<>();
     if(sc < dc){
         h1 = getMazePaths(sr,sc+1,dr,dc);
     }
     if(sr<dr){
         v1 = getMazePaths(sr+1,sc,dr,dc);
     }
     
  
     
     ArrayList<String> res = new ArrayList<>();
     for(String s:h1){
         res.add("h"+s);
     }
     for(String s:v1){
         res.add("v"+s);
     }
     return res;
    }

}
