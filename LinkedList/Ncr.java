import java.util.Arrays;
public class Ncr {
    private static int mod = 1000000007;
    private static int nCrUsingRecursion(int n,int r,int dp[][]){
        if(r == 0 || n == r){
            return 1;
        }
        if(r > n) return 0;
        if(dp[n][r] != -1) return dp[n][r];
        return dp[n][r] = (nCrUsingRecursion(n-1, r,dp) + nCrUsingRecursion(n-1, r-1,dp))%mod;
    }
    private static int nCr(int n,int r){
        int dp[][] = new int[n+1][r+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=r;j++){
                if(j > i) dp[i][j] = 0;
                if(j == i) dp[i][j] = 1;
                if(j == 0) dp[i][j] = 1;
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=r;j++){
                if(j > i) continue;
                if(j == i) continue;
                if(j == 0) continue;
                dp[i][j] = (dp[i-1][j-1]%mod + dp[i-1][j]%mod);
            }   
        }
        return dp[n][r]%mod;
    }
    
    public static void main(String args[]){
       
        int n = 3,r=2;
         int dp[][] = new int[n+1][r+1];
        for(int d[] : dp){
            Arrays.fill(d,-1);
        }
        System.out.println(nCrUsingRecursion(n,r,dp));
        System.out.println(nCr(n,r));
    }
}
