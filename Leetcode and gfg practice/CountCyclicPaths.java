public class CountCyclicPaths {
    private static int mod = 1000000007;
    private static int countCyclicPaths(int n){
        long ans = 0;
        if(n == 1) return 0;
        for(int i=2;i<=n;i++){
            if(i % 2 == 0){
                ans = (ans%mod*3%mod)%mod+3;
            }
            else{
                ans = (ans%mod * 3%mod)%mod-3;
            }
        }
        return (int)ans%mod;
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(countCyclicPaths(n));
    }
}
