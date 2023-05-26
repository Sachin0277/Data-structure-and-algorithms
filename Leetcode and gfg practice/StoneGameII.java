import java.util.Arrays;
public class StoneGameII {
    private static int dfs(int[] preSum, int m,int p,int[][] dp){
        if(p+2*m >= preSum.length) return preSum[p];
        if(dp[p][m] > 0) return dp[p][m];
        int res = 0,take = 0;
        for(int i=1;i<=2*m;i++){
            take = preSum[p]-preSum[p+i];
            res = Math.max(res,take+preSum[p+i] -dfs(preSum,Math.max(i,m),p+i,dp));
        }
        dp[p][m] = res;
        return res;
    }
    public static int stoneGameII(int[] piles) {
        int preSum[] = Arrays.copyOf(piles,piles.length);
        for(int i=preSum.length-2;i>=0;i--) preSum[i] += preSum[i+1];
        return dfs(preSum,1,0,new int[piles.length][piles.length]);
    }
    public static void main(String[] args) {
        int[] piles = {1,2,3,4,5,100};
        System.out.println(stoneGameII(piles));
    }
}
