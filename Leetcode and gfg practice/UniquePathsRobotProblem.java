public class UniquePathsRobotProblem {
    private static int uniquePaths(int m,int n){
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0) dp[0][j] = 1;
                if(j == 0) dp[i][j] = 1;
                if(i != 0 && j != 0){
                    dp[i][j] =dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String[] args) {
        int m = 3,n = 7;
        System.out.println(uniquePaths(m,n));
    }
}
