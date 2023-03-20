import java.util.ArrayList;

public class UniquesNumberOfPathInGrid {
    //Impelementation using recursion 

    private static int mod = (int)Math.pow(10,9)+7;
    private static int recursion(int i,int j,int n,int m,int[][] grid,int dp[][]){
        // base cases
        if(i == n || j == m) return 0;
        else if(grid[i][j] == 0) return 0;
        else if(i == n-1 && j == m-1) return 1;
        else if(dp[i][j] != -1) return (dp[i][j])%mod;
        else dp[i][j] = (recursion(i+1,j,n,m,grid,dp)+recursion(i,j+1,n,m,grid,dp))%mod;
        return dp[i][j]%mod;
    }
    static int uniquePaths(int n, int m, int[][] grid) {
        // code here
        
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return recursion(0,0,n,m,grid,dp);
    }
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
        int n = 3,m = 3;

        int ans = uniquePaths(n,m,grid);
        System.out.println(ans);
        }
    

}
