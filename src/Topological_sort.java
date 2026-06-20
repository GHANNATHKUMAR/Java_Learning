import java.util.*;
class Topological_sort {
    public static void dfs(int current,boolean[] isvis,  ArrayList<ArrayList<Integer>> graph, Stack<Integer> st){
        isvis[current]=true;
        for(int element:graph.get(current)){
            if(!isvis[element]) dfs(element,isvis,graph,st);
        }
        st.add(current);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
        }
        boolean isvis[]=new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!isvis[i]){
                dfs(i,isvis,graph,st);

            }
        }
        ArrayList<Integer> l1=new ArrayList<>();
        while(!st.empty()){
            l1.add(st.pop());
        }
        return l1;
    }

    public static void main(String[] args) {
        int edges[][]={{0,1},{1,2},{2,0}};
        System.out.println((topoSort(3,edges)));

    }
}