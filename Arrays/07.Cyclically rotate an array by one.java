/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    int a = sc.nextInt();
		    int arr[] = new int[a];
		    for(int i=0;i<a;i++){
		        arr[i] = sc.nextInt();
		    }
		    int temp = arr[arr.length-1];
		    for(int i=a-2;i>=0;i--){
		        arr[i+1]= arr[i];
		    }
		    arr[0] = temp;
		    for(int x:arr)
		    System.out.print(x+" ");
		    System.out.println();
		}
	}
}
