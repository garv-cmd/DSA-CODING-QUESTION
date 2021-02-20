/*
https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1
1. You are given a string.
2. You have to find the length of the longest substring of the given string that contains all non-repeating characters.
*/
import java.util.*;

public class Main {

	public static int solution(String str) {
		// write your code here
		HashMap<Character,Integer> map = new HashMap<>();
		int ans = 0;
		int i=-1,j=-1;
	
		while(true){
		    	boolean f1 = false;
		boolean f2 = false;
		    //acquire
		    while(i<str.length()-1){
		        f1 = true;
		        i++;
		        char ch = str.charAt(i);
		        map.put(ch,map.getOrDefault(ch,0)+1);
		        if(map.get(ch)==2){
		            break;
		        }else{
		            int len = i-j;
		            if(len>ans)
		            ans = len;
		        }
		    }
		    //release
		    while(j<i){
		        f2=true;
		        j++;
		        char ch = str.charAt(j);
		        map.put(ch,map.get(ch)-1);
		        if(map.get(ch)==1){
		            break;
		        }
		    }
		    if(f1==false && f2==false)
		    break;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
