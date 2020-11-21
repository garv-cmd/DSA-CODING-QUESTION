//https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    int num = sc.nextInt();
		    int arr[] = new int[100000];
		    int end=0;
		    arr[0]=1;
		    int carry=0;
		    for(int i=2;i<=num;i++){
		        for(int j=0;j<=end;j++){
		            int mul = arr[j]*i+carry;
		            arr[j] = mul%10;
		            carry = mul/10;
		        }
		        while(carry!=0){
		            arr[++end] = carry%10;
		            carry/=10;
		        }
		    }
		    for(int i=end;i>=0;i--)
		    System.out.print(arr[i]);
		    System.out.println();
		}
	}
}
