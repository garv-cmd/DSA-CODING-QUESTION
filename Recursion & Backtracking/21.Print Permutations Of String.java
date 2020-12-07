/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void powerSet(String str,String ans){
        
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String sub = str.substring(0,i)+str.substring(i+1);
            powerSet(sub,ans+ch);
        }
        
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		while(t-- !=0){
		    String str = sc.next();
		    
		    powerSet(str,"");
		    System.out.println();
		}
	}
}
