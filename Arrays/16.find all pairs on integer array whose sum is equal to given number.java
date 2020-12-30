//gfg link  - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        
        for(int i=0;i<n;i++){
            int diff=k-arr[i];
            Integer x=map.get(diff);
            if(x!=null){
                
                count+=x;
                
                
            }
           Integer y= map.get(arr[i]);
           if(y!=null){
             map.put(arr[i],y+1);
           } 
           else{
                 map.put(arr[i],1);
           }
            
            
            
        }
        return count;
    }
}


class Solution {
    int getPairsCount(int[] a, int n, int k) {
        // code here
         // code here
    int count = 0;
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j] == k)
                        count++;
                }
            }
            return count;
    }
}
