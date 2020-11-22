//https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together/0#
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		while(t!=0){
		    
		    int n=s.nextInt();
		    int ar[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    ar[i]=s.nextInt();
		    
		    int k=s.nextInt();
		    
		    int cnt=0;
		    
		    for(int i=0;i<n;i++)
		    if(ar[i]<=k)
		    cnt++;
		    
		   int max=Integer.MIN_VALUE;
		    
		    int good=0;
		    
		    int i;
		   for( i=0;i<cnt && i<n;i++){
		    if(ar[i]<=k)
		    good++;
		    
		    if(good>max)
		    max=good;
		   }
		   
		   while(i<n){
		       
		       if(ar[i-cnt]<=k)
		       good--;
		       
		       
		       if(ar[i]<=k)
		       good++;
		       
		       if(good>max)
		       max=good;
		       
		       i++;
		       
		   }
		   
		   System.out.println(cnt-max);
		   
		    t--;
	 }
}
}
