import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n+1];
  System.out.println(fiboDP(n,arr));
 }
 static int fiboDP(int n,int dp[]){
     if(n==0 || n==1)
     return n;
     
     if(dp[n]!=0)
     return dp[n];
     
     int f = fiboDP(n-1,dp);
     int s = fiboDP(n-2,dp);
     int sum = f+s;
     dp[n] = sum;
     return sum;
 }

}
