public class MakeArrayElementsEqual {
    private static long minOperations(int n){
        long k = n/2;
        long ans = k*k;
        if((n&1) == 1) ans+=k;
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;
        long ans = minOperations(n);
        System.out.println(ans);
        
    }
}
