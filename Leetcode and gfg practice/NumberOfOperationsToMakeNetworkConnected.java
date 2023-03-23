import java.util.*;
public class NumberOfOperationsToMakeNetworkConnected {

    /* Union Find Approach */
    static int[] parent;
    static int[] rank;
    
    // find function
    private static int find(int x){
        while(parent[x] != x){
            x = parent[parent[x]];
        }
        return x;
    }

    private static int makeUnion(int x,int y){
        int parentX = find(x);
        int parentY = find(y);
        if(parentX == parentY) return 0;
        if(rank[parentX] < rank[parentY]){
            parent[parentX] = parentY;
        }
        else if(rank[parentX] > rank[parentY]){
            parent[parentY] = parentX;
        }
        else{
            parent[parentY] = parentX;
            rank[parentX]++;
        }
        return 1;
    }

    private static int makeConnectedUnionFind(int n,int[][] connections){
        if(connections.length < n-1) return -1;
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        int comp = n;
        for(int c[]:connections){
            comp -= makeUnion(c[0], c[1]);
        }
        return comp-1;
    }

    /* DFS Approach */
    private static void dfs(int src, List<List<Integer>> adjList, boolean vis[]){
        vis[src] = true;
        for(int neighbour : adjList.get(src)){
            if(!vis[neighbour]){
                dfs(neighbour,adjList,vis);
            }
        }
    }
    private static int makeConnecteddfs(int n, int[][] connections){
        if(connections.length < n-1){
            return -1;
        }
        //create graph data structure
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        //fill the data of undirected graph
        for(int c[]:connections){
            adjList.get(c[0]).add(c[1]);
            adjList.get(c[1]).add(c[0]);
        }
        //create a visited array to check if the node is visited or not
        boolean vis[] = new boolean[n];
        int comp = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,adjList,vis);
                comp++;
            }
        }
        comp--;
        return comp;
    }
    public static void main(String[] args) {
        /* Input Management */
        int n = 6;
        int connections[][] = {{0,1},{0,2},{0,3},{1,2},{1,3}};

        int minOperations = makeConnecteddfs(n,connections);
        int ans = makeConnectedUnionFind(n,connections);
        System.out.println(minOperations);
        System.out.println(ans);
    }
}
