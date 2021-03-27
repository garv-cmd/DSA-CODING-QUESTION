Leetcode- 42. Trapping Rain Water
class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if(n==0)
            return 0;
        //left max
        int maxl[] = new int[n];
        maxl[0] = arr[0];
        for(int i=1;i<n;i++){
            maxl[i] = Math.max(maxl[i-1],arr[i]);
        }
        
      
        
        //right max
        int maxr[] = new int[n];
        maxr[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxr[i] = Math.max(maxr[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int diff = Math.min(maxl[i],maxr[i])-arr[i];
            sum+=diff;
        }
        
        
        
        return sum;
        
        
    }
}
