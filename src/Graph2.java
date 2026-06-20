import java.util.Arrays;
import java.util.Scanner;

public class Graph2 {
    public static void  AdjacencyMatrix(int[][] arr,int u,int v,boolean isdirected){
        if(isdirected){
            arr[u][v]=1;

        } else if (!isdirected) {
            arr[u][v]=1;
            arr[v][u]=1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int arr[][]=new int[v][v];
       AdjacencyMatrix(arr,0,1,true);
        AdjacencyMatrix(arr,5,5,true);
        AdjacencyMatrix(arr,2,3,false);
//       for(int i=0;i<v;i++){
//           for(int j=0;j<v;j++){
//               System.out.print(arr[i][j]);
//           }
//           System.out.println();
//       }
        for(int babyarr[]:arr){
            System.out.println(Arrays.toString(babyarr));
        }
    }
}
