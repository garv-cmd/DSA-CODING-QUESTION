/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- !=0){
		    HashSet<Integer> set = new HashSet<>();
		    int s = sc.nextInt();
		    int arr[] = new int[s];
		    for(int i=0;i<s;i++)
		    arr[i] = sc.nextInt();
		    int sum=0;
		    boolean check = false;
		    for(int e:arr){
		        set.add(sum);
		        sum+=e;
		        if(set.contains(sum)){
		            check = true;
		            break;
		        }
		    }
		    if(check)
		    System.out.println("Yes");
		    else  System.out.println("No");
		    
		    
		}
	}
}
