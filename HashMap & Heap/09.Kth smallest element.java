//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    PriorityQueue<Integer> p = new PriorityQueue<>();
    // 1 3 5 4 2
    for(int i:arr)
    p.add(i);
    int j=0;
    int val=0;
    while(j ++ !=k){
       val= p.remove();
    }
    return val;
    
    
} 
