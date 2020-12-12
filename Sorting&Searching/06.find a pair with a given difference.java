//https://practice.geeksforgeeks.org/problems/find-pair-given-difference/0#
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int g=0;g<t;g++){
		   int n=sc.nextInt();
		   int diff=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		   Arrays.sort(arr);
		   System.out.print(check(arr,diff));
		   System.out.println();
		}//end of test case
	}
	static int check(int arr[],int diff){
	    int i=0,j=1,d=0;
		   while(j<arr.length){
		        d=arr[j]-arr[i];
		       if(d>diff)
		         i++;
		       else if(d<diff)
		         j++;
		        else if(d==diff)
		        return(1);
		   }
		   return(-1);
	}
}//end of class
