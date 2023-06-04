public class NumberOfProvinces {

    /*Depth first search */
    private static void dfs(int isConnected[][],boolean vis[],int node){
        vis[node] = true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i] == 1 && !vis[i]){
                dfs(isConnected,vis,i);
            }
        }
    }

    /* FindCircleNum function */
    private static int findCircleNum(int isConnected[][]){
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int numOfProvinces = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                numOfProvinces++;
                dfs(isConnected,vis,i);
            }
        }
        return numOfProvinces;
    }
    public static void main(String args[]){
        int isConnected[][] = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Number of provinces "+findCircleNum(isConnected));
    }
}
