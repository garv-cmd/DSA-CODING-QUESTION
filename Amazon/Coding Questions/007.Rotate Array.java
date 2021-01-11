//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0){
		    int s = sc.nextInt();
		    int d = sc.nextInt();
		    int a[] = new int[s];
		    for(int i=0;i<s;i++){
		        a[(i+s-d)%s] = sc.nextInt();
		    }
		    for(int i: a){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}
