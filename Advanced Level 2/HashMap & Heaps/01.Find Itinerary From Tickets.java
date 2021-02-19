/*
1. You are given number N and 2*N number of strings that represent a list of N tickets(source and destination).
2. You have to find the itinerary in order using the given list of tickets.

Assumption -> The input list of tickets is not cyclic and there is one ticket from every city except the final destination.
4
Chennai Banglore 
Bombay Delhi 
Goa Chennai 
Delhi Goa 

*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		HashMap<String,Boolean> starting = new HashMap<>();
		for(String s:map.keySet()){
		    String source = s;
		    String dest = map.get(source);
		    if(!starting.containsKey(source)){
		        starting.put(source,true);
		    }else{
		        starting.put(source,false);
		    }
		     starting.put(dest,false);
		     
		    
		}
		
		String src="";
    for(String s:starting.keySet()){
        boolean st = starting.get(s);
        if(st){
             src=s;
            break;
        }
    }
   
   
   while(true){
       if(map.containsKey(src)){
           System.out.print(src+" -> ");
           String dest = map.get(src);
           src=dest;
       }else{
           System.out.print(src+".");
           break;
       }
   }
   
   
   
   

	}
}
