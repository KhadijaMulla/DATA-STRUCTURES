import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // BFS
    void BFS(int start) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // DFS
    void DFS(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.BFS(0);

        System.out.print("\nDFS Traversal: ");
        boolean visited[] = new boolean[5];
        g.DFS(0, visited);
    }
}