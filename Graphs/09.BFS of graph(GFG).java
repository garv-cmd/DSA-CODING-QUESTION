//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1#
class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int element = q.remove();
            res.add(element);
            for(int i:adj.get(element)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return res;
    }
}
