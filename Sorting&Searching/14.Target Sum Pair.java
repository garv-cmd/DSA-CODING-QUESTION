import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
      Arrays.sort(arr);
    //write your code here
    int l=0,h=arr.length-1;
    while(l<h){
        int sum = arr[l]+arr[h];
        if(sum<target)
        l++;
        else if(sum>target)
        h--;
        else {
            System.out.println(arr[l]+", "+arr[h]);
            l++;
            h--;
        }    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}
