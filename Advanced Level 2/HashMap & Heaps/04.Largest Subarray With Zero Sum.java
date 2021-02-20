/*
https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
1. You are given an array(arr) of integers.
2. You have to find the length of the largest subarray with sum 0.
8
15 -2 2 -8 1 7 10 23
*/
import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
		int sum=0,len=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		for(int i=0;i<arr.length;i++){
		    sum+=arr[i];
		    if(!map.containsKey(sum)){
		        map.put(sum,i);
		    }else{
		        int ind = map.get(sum);
		        int gap = i-ind;
		        if(gap>len)
		        len=gap;
		       // map.put(sum,i);
		    }
		}

		return len;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
