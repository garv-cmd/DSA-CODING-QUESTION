//https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1#
class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        boolean parent[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i])
            if( dfs(adj,V,visited,i,parent) ){
                return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int V,boolean []visited,int start ,boolean []parent){
       
        visited[start] = true;
        parent[start] = true;
        for(int i:adj.get(start)){
            if(!visited[i]){
               if(dfs(adj,V,visited,i,parent))
               return true;
            }else if(parent[i]){
                return true;
            }
        }
        parent[start] = false;
        return false;
    }
}
