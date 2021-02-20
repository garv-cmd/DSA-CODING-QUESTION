/*
Leetcode - 76
1. You are given two strings s1 and s2 containing lowercase english alphabets.
2. You have to find the smallest substring of s1 that contains all the characters of s2.
3. If no such substring exists, print blank string("").
*/
import java.util.*;

public class Main {

	public static String solution(String s1, String s2){
	HashMap<Character,Integer> map2 = new HashMap<>();
	for(int i=0;i<s2.length();i++){
	    char ch = s2.charAt(i);
	    map2.put(ch,map2.getOrDefault(ch,0)+1);
	}
	int mct=0;
	int dmct = s2.length();
	int i=-1,j=-1;
	HashMap<Character,Integer> map1 = new HashMap<>();
	String ans="";
	while(true){
	    boolean f1 = false;
	    boolean f2 = false;
	    //acquire
	    while(i<s1.length()-1 && mct<dmct){
	        f1 = true;
	        i++;
	        char ch = s1.charAt(i);
	         map1.put(ch,map1.getOrDefault(ch,0)+1);
	         
	         if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
	             mct++;
	         }
	    }
	    
	    //release
	    while(j<i && mct==dmct){
	        f2 = true;
	        String path = s1.substring(j+1,i+1);
	        if(ans.length()==0 || path.length()<ans.length()){
	            ans = path;
	        }
	        
	        j++;
	        char ch = s1.charAt(j);
	        if(map1.get(ch)==1){
	            map1.remove(ch);
	        }else{
	            map1.put(ch,map1.get(ch)-1);
	        }
	        if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
	            mct--;
	        }
	    }
	    if(f1==false && f2==false)
	    break;
	}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}
