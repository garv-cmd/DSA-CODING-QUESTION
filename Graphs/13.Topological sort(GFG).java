//
//https://practice.geeksforgeeks.org/problems/topological-sort/1
class Solution {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i])
             dfs(adj,V,visited,i,st) ;
        }
        int res[] = new int[st.size()];
        int q=0;
        while(!st.isEmpty()){
            res[q++] = st.pop();
        }
        return res;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int V,boolean []visited,int start ,Stack<Integer> st){
       
        visited[start] = true;
        
        for(int i:adj.get(start)){
            if(!visited[i]){
              dfs(adj,V,visited,i,st);
               
            }
        }
        st.push(start);
   
    }
    
    
    
    
}
