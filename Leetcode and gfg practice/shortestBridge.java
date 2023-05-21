import java.util.LinkedList;
import java.util.Queue;
public class shortestBridge{

    private static void dfs(int grid[][],Queue<int[]> q,boolean vis[][],int[][] dirs,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] || grid[i][j] == 0){
            return;
        }
        vis[i][j] = true;
        q.offer(new int[]{i,j});
        for(int dir[]: dirs){
            dfs(grid, q,vis,dirs,i+dir[0],j+dir[1]);
        }
    }

    private static int shortestBridgeLen(int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean vis[][] = new boolean[m][n];
        boolean flag = false;
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<m;i++){
            if(flag){
                break;
            }
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    dfs(grid,q,vis,dirs,i,j);
                    flag = true;
                    break;
                }
            }
        }
        int level = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-- > 0){
                int[] cur = q.poll();
                for(int dir[]:dirs){
                    int i= cur[0]+dir[0];
                    int j=cur[1]+dir[1];
                    if(i >= 0 && j>=0 && i < m && j< n && !vis[i][j]){
                        if(grid[i][j] == 1){
                            return level;
                        }
                        q.offer(new int[]{i,j});
                        vis[i][j] = true;
                    }
                }
            }
            level++;;
        }
        return -1;
    }
    public static void main(String[] args) {
        int grid[][] = {{0,1,0},{0,0,0},{0,0,1}};
        System.out.println(shortestBridgeLen(grid));
    }
}