import java.util.*;
public class comp_network_lab3_3 {
    static class Pair implements Comparable<Pair> {
        int v, w, parent;
        Pair(int v, int w, int parent) {
            this.v = v;
            this.w = w;
            this.parent = parent;
        }
        public int compareTo(Pair that) {
            return this.w - that.w;
        }
    }
    public static void main(String[] args) {
        int V = 9;
        List<int[]> edges = new ArrayList<>();
        edges.add(new int[]{0, 1, 4});
        edges.add(new int[]{1, 2, 8});
        edges.add(new int[]{1, 7, 11});
        edges.add(new int[]{0, 7, 8});
        edges.add(new int[]{2, 8, 2});
        edges.add(new int[]{2, 5, 4});
        edges.add(new int[]{2, 3, 7});
        edges.add(new int[]{8, 7, 7});
        edges.add(new int[]{8, 6, 6});
        edges.add(new int[]{6, 7, 1});
        edges.add(new int[]{5, 6, 2});
        edges.add(new int[]{4, 5, 10});
        edges.add(new int[]{3, 5, 14});
        edges.add(new int[]{3, 4, 9});
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[]{edge[1], edge[2]});
            adj.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0, -1));
        boolean[] visited = new boolean[V];
        int totalWeight = 0;
        List<String> mstEdges = new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (visited[curr.v]) continue;
            visited[curr.v] = true;
            totalWeight += curr.w;
            if (curr.parent != -1) {
                mstEdges.add((char)(curr.parent+97) + " - " + (char)(curr.v+97)+ " (Weight: " + curr.w + ")");
            }
            for (int[] neighbor : adj.get(curr.v)) {
                if (!visited[neighbor[0]]) {
                    pq.add(new Pair(neighbor[0], neighbor[1], curr.v));
                }

     }
        }
        System.out.println("Minimum Weight of MST: " + totalWeight);
        System.out.println("Edges in the MST:");
        for (String edge : mstEdges) System.out.println(edge);
    }
}
