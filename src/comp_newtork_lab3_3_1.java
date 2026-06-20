import java.util.*;
class Edge implements Comparable<Edge> {
    int u, v, w;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
    public int compareTo(Edge other) {
        return this.w - other.w;
    }
}
public class comp_newtork_lab3_3_1 {
    static int[] parent, rank;
    static void makeSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }
    static boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa == pb) return false;
        if (rank[pa] < rank[pb]) parent[pa] = pb;
        else if (rank[pa] > rank[pb]) parent[pb] = pa;
        else {
            parent[pb] = pa;
            rank[pa]++;
        }
        return true;
    }
    public static void main(String[] args) {
        Map<Character, Integer> map = Map.of(
                'a',0,'b',1,'c',2,'d',3,'e',4,
                'f',5,'g',6,'h',7,'i',8
        );
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(map.get('a'), map.get('b'), 4));
        edges.add(new Edge(map.get('a'), map.get('h'), 8));
        edges.add(new Edge(map.get('b'), map.get('c'), 8));
        edges.add(new Edge(map.get('b'), map.get('h'), 11));
        edges.add(new Edge(map.get('c'), map.get('d'), 7));
        edges.add(new Edge(map.get('c'), map.get('f'), 4));
        edges.add(new Edge(map.get('c'), map.get('i'), 2));
        edges.add(new Edge(map.get('d'), map.get('e'), 9));
        edges.add(new Edge(map.get('d'), map.get('f'), 14));
        edges.add(new Edge(map.get('e'), map.get('f'), 10));
        edges.add(new Edge(map.get('f'), map.get('g'), 2));
        edges.add(new Edge(map.get('g'), map.get('h'), 1));
        edges.add(new Edge(map.get('h'), map.get('i'), 7));
        edges.add(new Edge(map.get('i'), map.get('g'), 6));
        Collections.sort(edges);
        makeSet(9);
        int mstWeight = 0;
        System.out.println("Edges in MST (Kruskal):");
        for (Edge e : edges) {
            if (union(e.u, e.v)) {
                mstWeight += e.w;
                System.out.println((char)(e.u+97) + " - " + (char)(e.v +97)+ " : " + e.w);
            }
        }
        System.out.println("Total MST Weight = " + mstWeight);
    }
}