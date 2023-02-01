public class DistinctColoring{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        long dp[][] = new long[N][3];
        dp[0][0] = r[0];
        dp[0][1] = g[0];
        dp[0][2] = b[0];
        
        for(int i=1;i<N;i++){
            dp[i][0] = Math.min(dp[i-1][2],dp[i-1][1])+r[i];
            dp[i][1] = Math.min(dp[i-1][2],dp[i-1][0])+g[i];
            dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0])+b[i];
        }
        return Math.min(Math.min(dp[N-1][0],dp[N-1][1]),dp[N-1][2]);
    }
    public static void main(String args[]){
        int N = 3;
        int r[] = {1, 1, 1};
        int g[] = {2, 2, 2};
        int b[] = {3, 3, 3};

        long ans = distinctColoring(N, r, g, b);
        System.out.println(ans);
    }
}