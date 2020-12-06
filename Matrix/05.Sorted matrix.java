//https://practice.geeksforgeeks.org/problems/sorted-matrix/0#
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
		    int r= sc.nextInt();
		    int arr[] = new int[r*r];
		    for(int i=0;i<arr.length;i++)
		    arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    for(int i:arr)
		    System.out.print(i+" ");
		    System.out.println();
		    
		}
	}
}
