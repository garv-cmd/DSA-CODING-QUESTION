//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
class solve{
    static int minJumps(int[] arr){
        int n = arr.length;
        // your code here
         if(n<=0){
        return 0;
    }
    int steps=arr[0];
    int maxi=arr[0];
    int jumps=1;
    for(int i=1;i<n;i++)
    {
        if(i==n-1){
            return jumps;
        }
        maxi=Math.max(maxi,arr[i]+i);
        steps--;
        if(steps==0){
            jumps++;
            steps=maxi-i;
        }
        if(steps<=0){
            return -1;
        }
    }
    return jumps;
    }
}
