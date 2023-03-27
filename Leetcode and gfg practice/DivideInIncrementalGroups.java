public class DivideInIncrementalGroups {
    private static Integer[][][] memo;
    
    private static int recur(int i,int n,int k, int arr[],int sum){
        
        if(k == 0){
            if(sum == n) return  1;
            else return 0;
        }
        if(i == arr.length) return 0;
        return recur(i,n,k-1,arr,sum+arr[i]) + recur(i+1,n,k,arr,sum);
    }

    private static int countWaysToDivideByRecursion(int n,int k){
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        return recur(0,n,k,arr,0);
    }

    private static int countWaysToDivideByMemoization(int n,int k){
        memo = new Integer[n+1][n+1][k+1];
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        return recurmemo(0,n,k,arr,0);
    }
    private static int recurmemo(int i,int n,int k, int arr[],int sum){
        
        if(k == 0){
            if(sum == n) return  memo[i][sum][k] = 1;
            else return memo[i][sum][k] = 0;
        }

        if(i == arr.length) return memo[i][sum][k] =0;

        if(memo[i][sum][k] != null){
            return memo[i][sum][k];
        }
        return memo[i][sum][k] = recur(i,n,k-1,arr,sum+arr[i]) + recur(i+1,n,k,arr,sum);
    }

    private static int countWaysToDivideByDP(int n,int K){
        int dp[][][] = new int[n+1][n+1][K+1];
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = i+1;
        
        for(int i=n;i>=0;i--){
            for(int j=n;j>=0;j--){
                for(int k = 0;k <= K ;k++){
                   if(i == n) dp[i][j][k] = 0;
                   else if(j > n) dp[i][j][k] = 0;
                   else if(k == 0){
                    if(j == n) dp[i][j][k] = 1;
                    else dp[i][j][k] = 0;
                   }

                   else {
                    if(j+ arr[i] <= n){
                        dp[i][j][k] = dp[i][j+arr[i]][k-1]+dp[i+1][j][k];
                    }
                    else{
                        dp[i][j][k] = dp[i+1][j][k];
                    }
                   }
                }
            }
        }
        return dp[0][0][K];
    }
    public static void main(String args[]){
        int n = 8;
        int k = 4;
        int ans = countWaysToDivideByRecursion(n,k);
        System.out.println(ans);

        int ans1 = countWaysToDivideByMemoization(n,k);
        System.out.println(ans1);
        int ans2 = countWaysToDivideByDP(n,k);
       System.out.println(ans2);
       
    }
}
