public class BinaryKnapsackProblem {

    private static int digitalKnapsack(int []w,int[] val, int W){
        //create one-dimensional dp array
        int dp[] = new int[W+1];
        for(int i=1;i<val.length+1;i++){
            for(int j=W;j>=0;j--){
                if(w[i-1] <= j){
                    dp[j] = Math.max(dp[j-1],dp[j-w[i-1]]+val[i-1]);
                }
            }
           
        }
        return dp[W];
    }
    public static void main(String[] args) {
        int weights[] = {10,20,30};
        int profits[] = {60,100,120};
        int capacity = 50;

        int ans = digitalKnapsack(weights,profits,capacity);
        System.out.println(ans);
    }
}
