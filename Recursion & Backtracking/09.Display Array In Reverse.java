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
        displayArr(arr,n-1);
    }

    public static void displayArr(int[] arr, int n){
        
        if(n==-1)
        return;
        
          System.out.println(arr[n]);
        displayArr(arr,n-1);
      
        
    }

}
