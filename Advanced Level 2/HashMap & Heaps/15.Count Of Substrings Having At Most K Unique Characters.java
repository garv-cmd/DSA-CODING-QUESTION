/*
1. You are given a string(str) and a number K.
2. You have to find the count of substrings of the given string that contains at most K unique characters.
*/
import java.util.*;

public class Main {

	public static int solution(String str, int k) {
			int i=-1,j=-1;
		int ans = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		while(true){
		    boolean f1 = false;
		    boolean f2 = false;
		    
		    while(i<str.length()-1){
		        i++;
		         f1 = true;
		        char ch = str.charAt(i);
		        map.put(ch,map.getOrDefault(ch,0)+1);
		        if(map.size()<=k){
		            int len = i-j;
		            ans += len;
		        }else{
		            break;
		        }
		    }
		    if(i==str.length()-1 && map.size()<=k)
		    break;
		    while(j<i){
		        j++;
		        f2 = true;
		        char ch = str.charAt(j);
		        if(map.get(ch)==1){
		            map.remove(ch);
		        }else{
		            map.put(ch,map.get(ch)-1);
		        }
		        if(map.size()>k)
		        continue;
		        else{
		             int len = i-j;
		             ans += len;
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
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
