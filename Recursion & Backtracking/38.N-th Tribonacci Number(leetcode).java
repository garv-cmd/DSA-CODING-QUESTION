leetcode - 1137
class Solution {
    public int tribonacci(int n) {
        int visited[] = new int[n+1];
        return ans(n,visited);
    }
    public int ans(int n,int[] visited){
        if(n<0)
            return 0;
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        if(n==3)
            return 2;
        if(visited[n]!=0)
            return visited[n];
        int s = ans(n-1,visited)+ans(n-2,visited)+ans(n-3,visited);
        visited[n] = s;
        return s;
    }
}
