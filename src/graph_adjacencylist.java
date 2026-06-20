import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class graph_adjacencylist {
    static void adjacencylist(List<List<Integer>> adjlist, int u, int v, boolean isdirected) {
        if (isdirected) {
            adjlist.get(u).add(v);
        } else {
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices : ");
        int V = sc.nextInt();
        List<List<Integer>> listadj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            listadj.add(new ArrayList<>()); // V number of list add kar diya chhota chhota in 2d List
        }
        adjacencylist(listadj, 0, 1, false);
        adjacencylist(listadj, 0, 2, false);
        adjacencylist(listadj, 0, 3, false);
        adjacencylist(listadj, 1, 4, false);
        adjacencylist(listadj, 2, 3, false);
        adjacencylist(listadj, 2, 4, false);
        adjacencylist(listadj, 3, 4, false);
        for (int i = 0; i < listadj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < listadj.get(i).size(); j++) {
                System.out.print(listadj.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
