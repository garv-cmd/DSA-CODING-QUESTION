//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
class Solution
{
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        boolean visited[] = new boolean[V];
        dfs(adj,V,0,visited,res);
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int V,int start ,boolean []visited,ArrayList<Integer> res){
        res.add(start);
        visited[start] = true;
        
        for(int i:adj.get(start)){
            if(!visited[i]){
                dfs(adj,V,i,visited,res);
            }
        }
    }
    
}
