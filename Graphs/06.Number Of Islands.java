/*
1. You are given a 2d array where 0's represent land and 1's represent water. 
     Assume every cell is linked to it's north, east, west and south cell.
2. You are required to find and count the number of islands.
input - 
8
8
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
1 1 1 1 1 1 1 0
1 1 0 0 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 0
output - 
3
*/
import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean visited[][] = new boolean[m][n];
      int count = 0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(arr[i][j]==0 && visited[i][j]==false){
                  getTree(arr,i,j,visited);
                  count++;
              }
          }
         
      }
       System.out.println(count);
   }
       public static void getTree(int[][] arr,int i,int j,boolean [][] visited){
          if(i< 0 || j<0 || i >= arr.length || j>=arr[0].length || arr[i][j] == 1|| visited[i][j] == true){
              return;
          }
          visited[i][j] = true;
          getTree(arr,i+1,j,visited);
          getTree(arr,i,j+1,visited);
          getTree(arr,i,j-1,visited);
          getTree(arr,i-1,j,visited);
      }
      
      
}
