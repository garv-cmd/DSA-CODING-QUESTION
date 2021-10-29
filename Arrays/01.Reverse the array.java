/*package whatever //do not write package name here */
// https://practice.geeksforgeeks.org/problems/reverse-the-string/0

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    String s = sc.next();
		    char c[] = s.toCharArray();
		    for(int j=c.length-1;j>=0;j--)
		    System.out.print(c[j]);
		    System.out.println();
		}
		
	}
}
