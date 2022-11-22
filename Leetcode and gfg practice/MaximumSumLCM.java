public class MaximumSumLCM {
    private static int maximumSumLcm(int n){
        int ans = 0;
        for(int i=1;i*i <= n;i++){
            if(n % i == 0){
                int t = i;
                int u = n/i;
                if(t == u)
                    ans += t;
                else    
                    ans += t+u;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int n = 10;
        //ans = 18
        System.out.println(maximumSumLcm(n));
    }
}
