/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array/0#
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
		    int b = sc.nextInt();
		    int hash[] = new int[100001];
		    for(int i=0;i<a;i++){
		        hash[sc.nextInt()]++;
		    }
		    for(int i=0;i<b;i++){
		        hash[sc.nextInt()]--;
		    }
		    int j;
		    for(j=0;j<100001;j++){
		        if(hash[j] < 0)
		        break;
		    }
		    
		    
		    if(j==100001){
		        System.out.println("Yes");
		    }else
		     System.out.println("No");
		    
		    
		}
	}
}
