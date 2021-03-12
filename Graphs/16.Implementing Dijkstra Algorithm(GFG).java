//https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
class Solution
{

static int getMin(int distance[], boolean visited[]) {

int min = Integer.MAX_VALUE;
int minIndex = -1;

for (int i = 0; i < distance.length; i++) {

if (!visited[i] && distance[i] < min) {

min = distance[i];
minIndex = i;
}

}

return minIndex;

}

static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
{
// Write your code here


int distance[] = new int[V];
boolean visited[] = new boolean[V];

for (int i = 0; i < V; i++) {

distance[i] = Integer.MAX_VALUE;
visited[i] = false;

}

distance[S] = 0;

for (int q=0;q<V;q++) {

int u = getMin(distance, visited);


visited[u] = true;

for (int i = 0; i < adj.get(u).size(); i++) {


int v = adj.get(u).get(i).get(0);
int costUV = adj.get(u).get(i).get(1);


if (!visited[v] && distance[u] + costUV < distance[v]) {

distance[v] = distance[u] + costUV;

}

}

}


return distance;
}
}
