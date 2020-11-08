/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int a[] = new int[n1];
		    int b[] = new int[n2];
		    
		    int hash[] = new int[100000];
		    for(int i=0;i<n1;i++){
		        a[i] = sc.nextInt();
		        hash[a[i]]++;
		    }
		    
		    for(int i=0;i<n2;i++){
		        b[i] = sc.nextInt();
		        hash[b[i]]++;
		    }
		    
		    int res=0;
		    for(int x:hash){
		        if(x!=0)
		        res++;
		    }
		    System.out.println(res);
		    
		}
	}
}
