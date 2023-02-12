import java.util.ArrayList;
public class MinimumFuelCostToReportToTheCapital{
    private static long fuel = 0;
    static int s = 0;

    private static int dfs(int node, int prev, ArrayList<ArrayList<Integer>> graph){
        int representative = 1;
        for(int adj : graph.get(node)){
            if(adj == prev) continue;
            representative += dfs(adj,node,graph);

        }
        if(node != 0)
            fuel += (representative + s - 1)/s;
        return representative;
    }

    private static long minimumFuelCost(int[][] roads,int seats){
        //create a graph adjacency list representation of roads
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        s = seats;
        for(int i=0;i<roads.length+1;i++){
            graph.add(new ArrayList<>());
        }
        for(int road[] : roads){
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        //calling the dfs (recursive function)
        dfs(0,0,graph); //since the capital city is 0 so calling with 0
        return fuel;
    }
    public static void main(String args[]){
        int[][] roads = {{0,1},{0,2},{0,3}};
        int seats = 5;

        long ans = minimumFuelCost(roads,seats);
        System.out.println(ans);
    }
}