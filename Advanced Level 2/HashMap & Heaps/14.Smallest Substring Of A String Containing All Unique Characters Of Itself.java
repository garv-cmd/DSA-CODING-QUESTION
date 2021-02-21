/*
1. You are given a string str.
2. You have to find the smallest window length that contains all the unique characters of the given string.
*/
import java.util.*;

public class Main {

	public static int solution(String str){
		// write your code here
		HashSet<Character> set = new HashSet<>();
		int len=str.length();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    set.add(ch);
		}
		HashMap<Character,Integer> map = new HashMap<>();
		int i=-1,j=-1;
		while(true){
		    boolean f1 = false;
		    boolean f2 = false;
		    while(i<str.length()-1 && map.size()<set.size()){
		        f1 = true;
		        i++;
		        char ch = str.charAt(i);
		        map.put(ch,map.getOrDefault(ch,0)+1);
		        
		    }
		    while(j<i && map.size()==set.size()){
		        f2 = true;
		        int pi = i-j;
		        if(pi<len)
		        len = pi;
		        j++;
		        char ch = str.charAt(j);
		        if(map.get(ch)==1){
		            map.remove(ch);
		        }else{
		            map.put(ch,map.get(ch)-1);
		        }
		        
		    }
		    if(f1==false && f2==false)
		    break;
		    
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
