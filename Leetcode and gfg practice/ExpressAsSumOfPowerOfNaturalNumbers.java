import java.util.*;
public class ExpressAsSumOfPowerOfNaturalNumbers {
    private static int mod = (int)Math.pow(10,9)+7;
    private static int recur(int dp[][],int n ,int i,int x){
        if(Math.pow(i,x)  > n) return 0;
        if(Math.pow(i,x) == n) return 1;
        if(dp[i][n] != -1) return dp[i][n];
        int take = recur(dp,n-(int)Math.pow(i,x),i+1,x);
        int notTake = recur(dp,n,i+1,x);
        return dp[i][n] = (take%mod + notTake%mod)%mod;
    }
    private static int numberOfWays(int n , int x){
        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return recur(dp, n, 1, x);
    }
    public static void main(String args[]){
        int n = 100,x = 2;
        System.out.println(numberOfWays(n,x));
    }
}
