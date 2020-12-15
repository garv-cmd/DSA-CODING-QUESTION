//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0){
		    int s1 = sc.nextInt();
		    int s2 = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[s1];
		    int b[] = new int[s2];
		    ArrayList<Integer> ll = new ArrayList<>();
		    for(int i=0;i<s1;i++){
		        
		        a[i] = sc.nextInt();
		        ll.add(a[i]);
		    }
		    for(int i=0;i<s2;i++){
		        b[i] = sc.nextInt();
		             ll.add(b[i]);
		    }
		    Collections.sort(ll);
		    System.out.println(ll.get(k-1));
		    
		}
	}
}
