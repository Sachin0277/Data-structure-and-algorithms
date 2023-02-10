
/*
 * Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land, find a water cell such that its
 * distance to the nearest land cell is maximized, and return the distance. If no land or water exists in the grid, return -1.
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
 */

 import java.util.Queue;
 import java.util.LinkedList;
public class AsFarFromLandAsPossible {

    private static int maxDist(int[][] grid){
        int m = grid.length,n = grid[0].length;
        //create a boolean array for visited cell
        boolean vis[][] = new boolean[m][n];
        //create the queue to keep index 
        Queue<int[]> q = new LinkedList<>();
        // traverse the whole array and fill the vis array with true
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    vis[i][j] = true;
                    q.add(new int[]{i,j});
                }
            }
        }
        int res = -1;
        int dirs[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}}; // direction array to move in all possible direction
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int dir[] : dirs){
                int x = cur[0]+dir[0];
                int y = cur[1]+dir[1];
                //check the boundary condition and visited cell or not 
                if(x >= 0 && x < m && y >= 0 && y < m && !vis[x][y]){
                    vis[x][y] = true;
                    grid[x][y] = grid[cur[0]][cur[1]]+1;
                    res = Math.max(res,grid[x][y]);
                    q.offer(new int[]{x,y});
                }
            }
         }
         return res == -1 ? -1 : res-1;
    }
    public static void main(String args[]){
        //Input 
        int grid[][] = new int[][]{
            {1,0,1},
            {0,0,0},
            {1,0,1}
                    };
        //output
        int ans = maxDist(grid);
        //Display the output 
        System.out.println(ans);
    }
}
