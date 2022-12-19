import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindIfPathExistsInGraph {
    private static boolean  validPath(int n,int[][] edges,int source,int destination){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];

            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        boolean vis[] = new boolean[n];
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(source);
        while(queue.size() > 0){
            int cur = queue.poll();
            if(cur == destination){
                return true;
            }
            for(int i=0;i<graph.get(cur).size();i++){
                if(vis[graph.get(cur).get(i)] == false){
                    vis[graph.get(cur).get(i)] = true;
                    queue.add(graph.get(cur).get(i));
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n = 3;
        int[][] edges = new int[][]{{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;
        if(validPath(n,edges,source,destination)){
            System.out.println("There exists a path from source to destination in graph");
        }
        else{
            System.out.println("There does not exist path from source to destination in graph");
        }
    }
}
