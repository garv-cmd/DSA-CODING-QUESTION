/*
https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1
1. You are given an array(arr) of integers.
2. You have to find the count of all subarrays with sum 0.
*/
import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++){
		    sum+=arr[i];
		    if(!map.containsKey(sum) ){
		        map.put(sum,1);
		    }else{
		        int freq = map.get(sum);
		        map.put(sum,freq+1);
		        count+=freq;
		    }
		}

		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));

	}

}
