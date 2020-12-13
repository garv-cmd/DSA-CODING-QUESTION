/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        System.out.println(climb(n,dp));
    }
    static int climb(int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]!=0)
        return dp[n];
      int a=  climb(n-1,dp);
       int b=  climb(n-2,dp);
        int c=  climb(n-3,dp);
        int sum = a+b+c;
        dp[n] = sum;
        return sum;
    }

}
