import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int s = sc.nextInt();
    int l = 0;
    int h = arr.length-1;
    while(l<=h){
        int mid = (l+h)/2;
        if(arr[mid] > s){
            h = mid-1;
        }
        else if(arr[mid] < s){
           
             l = mid+1;
        }
        else {
          
            break;
        }
    }
    System.out.println(arr[l]);
    System.out.println(arr[h]);
    
 }

}
