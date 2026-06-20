import java.util.Scanner;

public class graph {
    // Method to update the adjacency matrix based on directed or undirected graph
    static void adjacencyMatrix(int arr[][], int u, int v, boolean directed) {
        if (directed) {
            arr[u][v] = 1;  // For directed graph, only set u -> v
        } else {
            arr[u][v] = 1;  // For undirected graph, set u -> v and v -> u
            arr[v][u] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();  // Number of vertices
        System.out.println("Number of vertices: " + V);
        int arr[][] = new int[V][V];  // Initialize the adjacency matrix // by default everyplace will be  0 in java
        // Add edges to the adjacency matrix (undirected edges)
        adjacencyMatrix(arr, 0, 1, false);
        adjacencyMatrix(arr, 0, 2, false);
        adjacencyMatrix(arr, 0, 3, false);
        adjacencyMatrix(arr, 1, 4, false);
        adjacencyMatrix(arr, 2, 3, false);
        adjacencyMatrix(arr, 2, 4, false);
        adjacencyMatrix(arr, 3, 4, false);

        // Print the adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(arr[i][j] + " ");  // Print each element in the matrix
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}

