//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
/*
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

*/
public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    PriorityQueue<Integer> p = new PriorityQueue<>();
    for(int i:arr)
    p.add(i);
    int j=0;
    int val=0;
    while(j ++ !=k){
       val= p.remove();
    }
    return val;
    
    
} 
