import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
     
        int li[] = new int[n];
        int ld[] = new int[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<=arr[i]){
                    max = Math.max(max,li[j]);
                }
            }
            li[i] = max+1;
            
        }
         for(int i=n-1;i>=0;i--){
            int max=0;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<=arr[i]){
                    max = Math.max(max,ld[j]);
                }
            }
            ld[i] = max+1;
            
        }
        int res=0;
        for(int i=0;i<n;i++){
            int s = li[i]+ld[i]-1;
            res=Math.max(s,res);
        }
        System.out.println(res);
    }

}
