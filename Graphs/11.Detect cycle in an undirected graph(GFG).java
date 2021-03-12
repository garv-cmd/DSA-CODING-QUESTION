//https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i])
            if( dfs(adj,V,visited,i,-1) ){
                return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int V,boolean []visited,int start ,int parent){
       
        visited[start] = true;
        
        for(int i:adj.get(start)){
            if(!visited[i]){
               if(dfs(adj,V,visited,i,start))
               return true;
            }else if(i!=parent){
                return true;
            }
        }
        return false;
    }
}
