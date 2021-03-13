//https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1
class Solution
{
    void dfs(ArrayList<ArrayList<Integer>> adj,int V,boolean []visited,Stack<Integer> st,int start){
        visited[start] = true;
        for(int n:adj.get(start)){
            if(!visited[n])
                dfs(adj,V,visited,st,n);
        }
        st.push(start);
    }
    void newdfs(ArrayList<ArrayList<Integer>> adj,int V,boolean []visited,int start){
        visited[start] = true;
        for(int n:adj.get(start)){
            if(!visited[n])
                newdfs(adj,V,visited,n);
        }
      
    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        //code here
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i])
        dfs(adj,V,visited,st,i);
    }
        //make visited false again
        for(int i=0;i<visited.length;i++)
        visited[i] = false;
        
        //make a new graph which is reversed
        ArrayList<ArrayList<Integer>> adjInverse = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjInverse.add(new ArrayList<Integer>());
        }
        
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < adj.get(u).size(); v++) 
            {
                    adjInverse.get(adj.get(u).get(v)).add(u);
                    }
            
        }
        
        int count = 0;
        while(!st.isEmpty()){
            int ele = st.pop();
            if(!visited[ele]){
                newdfs(adjInverse,V,visited,ele);
                count++;
            }
        }
        
        return count;
        
    }
}
