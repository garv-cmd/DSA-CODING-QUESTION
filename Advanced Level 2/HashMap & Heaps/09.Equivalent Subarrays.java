/*
https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1
1. You are given an array of integers(arr).
2. You have to find the count of equivalent subarrays.
3. A subarray is equivalent if,
   count of unique integers in the subarray = count of unique integers in the given array.
   
*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        	HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
            set.add(arr[i]);
        }
	
		int k = set.size();
		int i=-1,j=-1;
		int ans=0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		while(true){
		    boolean f1 = false;
		    boolean f2 = false;
		    while(i<arr.length-1){
		        i++;
		        f1 = true;
		        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		        if(map.size()==k){
		            ans+=arr.length-i;
		            break;
		        }
		    }
		    while(j<i){
		        j++;
		        f2 = true;
		        if(map.get(arr[j])==1){
		            map.remove(arr[j]);
		        }
		        else{
		            map.put(arr[j],map.get(arr[j])-1);
		        }
		        if(map.size()==k){
		            ans+=arr.length-i;
		        }else
		        break;
		    }
		    if(f1==false &&  f2==false)
		    break;
		}
		
		System.out.println(ans);
		
	}


}1111111111111111
