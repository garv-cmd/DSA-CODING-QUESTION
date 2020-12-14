/*
1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of combinations of the n coins using which the 
     amount "amt" can be paid.
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int amt = sc.nextInt();
        
        int dp[] = new int[amt+1];
        dp[0] = 1;
        for(int i=0;i<arr.length;i++){
            for(int j = arr[i];j<dp.length;j++){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[amt]);
        
    }
}
