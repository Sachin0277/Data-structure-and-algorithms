import java.util.List;
import java.util.ArrayList;
public class ReorderRoutesToMakeAllPathsLeadToCityZero {

    private static int dfs(int source, boolean vis[], List<List<Integer>> graph){
        int count = 0;
        vis[source] = true;
        for(int adj : graph.get(source)){
            if(!vis[Math.abs(adj)]){
                count += dfs(Math.abs(adj),vis,graph)+(adj > 0? 1:0);
            }
        }
        return count;
    }

    private static int minReorder(int n, int[][] connections){
        //create graph 
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int con[]: connections){
            graph.get(con[0]).add(con[1]);
            graph.get(con[1]).add(-con[0]);
        }

        return dfs(0,new boolean[n],graph );

    
    }
    public static void main(String args[]){
        int n =  6;
        int connections[][] = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        System.out.println(minReorder(n,connections));
    }
}
