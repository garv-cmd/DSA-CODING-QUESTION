//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    int s = sc.nextInt();
		    int arr[] = new int[s];
		    for(int i=0;i<s;i++)
		    arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    int m = sc.nextInt();
		    int min = Integer.MAX_VALUE;
		    for(int i=0;i+m-1<s;i++){
		        int d = arr[i+m-1]-arr[i];
		       
		        min = Math.min(min,d);
		    }
		    System.out.println(min);
		}
	}
}
