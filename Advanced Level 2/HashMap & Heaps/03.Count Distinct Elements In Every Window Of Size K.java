/*
https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
1. You are given an array(arr) of integers and a number K.
2. You have to find the count of distinct numbers in all windows of size k.
7
1 2 1 3 4 2 3        
4
*/
import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] arr, int k) {
		//freq map
		HashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<k-1;i++){
		    if(!map.containsKey(arr[i])){
		        map.put(arr[i],1);
		    }else{
		        int freq = map.get(arr[i]);
		        map.put(arr[i],freq+1);
		    }
		}
		int d=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=k-1;i<arr.length;i++){
		     if(!map.containsKey(arr[i])){
		        map.put(arr[i],1);
		    }else{
		        int freq = map.get(arr[i]);
		        map.put(arr[i],freq+1);
		    }
		    al.add(map.size());
		   int f = map.get(arr[d]);
		   if(f==1){
		       map.remove(arr[d]);
		   }else{
		       map.put(arr[d],f-1);
		   }
		   d++;
		}
		
		    
		

		return al;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans = solution(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}
	}


}
