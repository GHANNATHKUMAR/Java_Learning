public class DisjointSet {
    int rank[];
    int parent[];
    DisjointSet(int n){
        rank=new  int[n+1];
        parent=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    void union(int u, int v){
        int ulp_u=findParent(u);
        int ulp_v=findParent(v);
        if(ulp_u==ulp_v) return;
        if(rank[ulp_u]<rank[ulp_v]){
            parent[ulp_u]=ulp_v;
        } else if (rank[ulp_u]>rank[ulp_v]) {
            parent[ulp_v]=ulp_u;
        }
        else{
            parent[ulp_v]=ulp_u;
            rank[ulp_u]++;
        }
    }
    int findParent(int node){
        if(node==parent[node]) return node;
        return parent[node]=findParent(parent[node]);
    }

    public static void main(String[] args) {
        DisjointSet obj=new DisjointSet(7);
        obj.union(1,1);
        obj.union(2,3);
        obj.union(4,5);
        obj.union(6,7);
        obj.union(5,6);
        if(obj.findParent(3)== obj.findParent(7)){
            System.out.println("They belong to the same component");
        }
        else {
            System.out.println("no");
        }
        System.out.println(obj.parent[1]);
        obj.union(3,7);
        if(obj.findParent(3)== obj.findParent(7)){
            System.out.println("They belong to the same component");
        }
        else {
            System.out.println("no");
        }
        System.out.println(obj.parent[1]);
    }
}
