public class largestSumCycles {
    private static long cycles = -1;
    //Method which will return the larges sum of cycles 
    private static long largestSumCycles(int n,int edges[]){
        boolean vis[] = new boolean[n];
        boolean pathVis[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,edges,vis,pathVis);
            }
        }
        return cycles;
    }

    //Method which will check whether the given node is visited and is participating in cycles or not
    private static void dfs(int node,int[] edges,boolean[] vis, boolean pathVis[]) {
        vis[node] = true;
        pathVis[node] = true;
        if(edges[node] != -1){
            int adjNode = edges[node];
            if(!vis[adjNode])
                dfs(adjNode,edges,vis,pathVis);
            else if(pathVis[adjNode]){
                int cur = adjNode;
                long sum = 0l;
                do{
                    sum+=cur;
                    cur  = edges[cur];
                }while(cur != adjNode);
                cycles = Math.max(cycles,sum);
            
            }
        }
        pathVis[node] = false;
    }
    public static void main(String args[]){
        //Input parameters
        int n = 4;
        int edges[] = {1,2,0,-1};

        //function call 
        long ans = largestSumCycles(n,edges);
        System.out.println(ans);
    }
}
