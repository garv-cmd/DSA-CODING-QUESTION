//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0
/*package whatever //do not write package name here */


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	            
	            Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	            
	            while(t--!=0)
	            {
	                
	                int n=sc.nextInt();
	                int x=sc.nextInt();
	                
	                int arr[]=new int[n];
	                
	                for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	                    
	               int first=FirstIndex(arr,x);
	               int second=SecondIndex(arr,x);
	               
	              if(first==-1&&second==-1)
    		                  System.out.print(-1);
	    	      else
		              System.out.print(first+" "+second);
		                System.out.println(); 
	                
	            }
	            
	}
	
	public static int FirstIndex(int arr[],int target)
	{
	           int low=0;
	           int high=arr.length-1;
	           int index=-1;
	           
	            while(low<=high)
	            {
	                int midpoint=low+(high-low)/2;
	                
	                if(arr[midpoint]>=target)
	                        high=midpoint-1;
	                else{
	                     low=midpoint+1;
	                }
	                
	               if(arr[midpoint]==target) index=midpoint; 
	            }
	    
	    
	                return index;
	}
	
	
		public static int SecondIndex(int arr[],int target)
	    {
	           int low=0;
	           int high=arr.length-1;
	           int index=-1;
	           
	            while(low<=high)
	            {
	                int midpoint=low+(high-low)/2;
	                
	                if(arr[midpoint]<=target)
	                        low=midpoint+1;
	                else{
	                   high=midpoint-1;
	                }
	                
	               if(arr[midpoint]==target) index=midpoint; 
	            }
	                return index;
	    }
	
}
