import java.util.Scanner;
public class comp_network_lab2_1{
    static void adjacencyMatrix(int arr[][], int u, int v,int weight, boolean directed) {
        if (directed) {
            arr[u][v] = weight;
        } else {
            arr[u][v] = weight;
            arr[v][u] = weight;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();
        int m=V+1;
        System.out.println("Number of vertices: " + V);
        int arr[][] = new int[m][m];
        adjacencyMatrix(arr, 1, 2,9, true);
        adjacencyMatrix(arr, 2, 1,3, true);
        adjacencyMatrix(arr, 1, 3, 5,true);
        adjacencyMatrix(arr, 3, 4,12, true);
        adjacencyMatrix(arr, 2, 4,18, true);
        adjacencyMatrix(arr, 4, 2,2, true);
        adjacencyMatrix(arr, 4, 8,8, true);
        adjacencyMatrix(arr, 8, 5,3, true);
        adjacencyMatrix(arr, 5, 8,3, true);
        adjacencyMatrix(arr, 5, 4,9, true);
        adjacencyMatrix(arr, 5, 7, 5,true);
        adjacencyMatrix(arr, 7, 5,4, true);
        adjacencyMatrix(arr, 5, 6,2, true);
        adjacencyMatrix(arr, 6, 7,1, true);
        adjacencyMatrix(arr, 7, 8,6, true);
        System.out.println("\nAdjacency Matrix:");
        System.out.print("\t");
        for(int i=1;i<m;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            System.out.print(i+"\t");
            for (int j = 1; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
