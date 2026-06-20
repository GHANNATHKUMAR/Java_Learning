import java.util.*;
class Pair implements Comparable<Pair> {
    int v;
    int weight;
    Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }
    public int compareTo(Pair that) {
        return this.weight - that.weight;
    }
}
class comp_network_lab2_2 {
    public int[] dijkstra(int V, List<int[]> edges, int src) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adj.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        pq.offer(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair obj = pq.poll();
            int x = obj.v;
            int y = obj.weight;
            if (y > ans[x]) continue;
            for (Pair element : adj.get(x)) {
                int dest = element.v;
                int we = element.weight;
                if (ans[dest] > y + we) {
                    ans[dest] = y + we;
                    pq.offer(new Pair(dest, ans[dest]));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
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
        comp_network_lab2_2 obj = new comp_network_lab2_2();
        for(int i=0;i<9;i++) {
            int[] result = obj.dijkstra(9, edges, i);
            System.out.print("Node " + (char)(i+97) + " as a source->  ");
            System.out.print(Arrays.toString(result));
            System.out.println();
        }
    }
}
