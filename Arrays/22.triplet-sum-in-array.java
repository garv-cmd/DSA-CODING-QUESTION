/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array/0#
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
		    int num = sc.nextInt();
		    int arr[] = new int[s];
		    for(int i=0;i<s;i++)
		    arr[i] = sc.nextInt();
		    boolean check = false;
		    
		    for(int i=0;i<s;i++){
		    HashSet<Integer> set = new HashSet<>();
		    
		    for(int j=i+1;j<s;j++){
		        
		        if(set.contains(num-arr[i]-arr[j])){ //9
		           check = true;
		           break;
		        }
		        set.add(arr[j]);
		       
		    }
		    if(check){
		        break;
		    }
		        
		    }
		    
		    if(check)
		    System.out.println("1");
		    else
		     System.out.println("0");
		           
		    
		}
	}
}
