https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1#//
public static int findSubarray(int[] arr ,int n) 
{
    //Your code here
    Map<Integer,Integer> map = new HashMap<>();
    int sum=0;
    int count = 0;
    map.put(0,1);
    for(int i=0;i<n;i++){
       sum+=arr[i];
       if(map.containsKey(sum)){
           count+=map.get(sum);
           map.put(sum,map.get(sum)+1);
       }else
       map.put(sum,1);
       
    }
    return count;
}
