/*
1. You are given a number n (representing the number of students). Each student will have an id 
     from 0 to n - 1.
2. You are given a number k (representing the number of clubs)
3. In the next k lines, two numbers are given separated by a space. The numbers are ids of 
     students belonging to same club.
4. You have to find in how many ways can we select a pair of students such that both students are 
     from different clubs.
     
     7
5
0 1
2 3
4 5
5 6
4 6
 */
 import java.io.*;
import java.util.*;

public class Main {

    static class Edge {
        int v1;
        int v2;
        Edge(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList < Edge > [] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList < > ();
        }
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(new Edge(a, b));
            graph[b].add(new Edge(b, a));
        }
        ArrayList < ArrayList < Integer >> comps = new ArrayList < > ();
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                ArrayList < Integer > al = new ArrayList < > ();
                getFriends(graph, i, al, visited);
                comps.add(al);
            }
        }
        int c = 0;
        int pairs = 0;
        for (int i = 0; i < comps.size() - 1; i++) {
            for (int j = i + 1; j < comps.size(); j++) {
                c = comps.get(i).size() * comps.get(j).size();
                pairs += c;
            }
        }
        System.out.println(pairs);


    }
    public static void getFriends(ArrayList < Edge > [] graph, int i, ArrayList < Integer > al, boolean[] visited) {
        visited[i] = true;
        al.add(i);
        for (Edge e: graph[i]) {
            if (visited[e.v2] == false) {
                getFriends(graph, e.v2, al, visited);
            }
        }
    }









}
