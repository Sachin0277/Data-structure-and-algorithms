public class CountTotalSetBits {

    private static long setBits(long n){
        long cnt=0;
        while(n > 0){
            n &= (n-1);
            cnt++;
        }
        return cnt;
    }
    private static long countSetBits(long n){
        long counter = 0;
        for(long i=1;i<=n;i++){
            counter += setBits(i);
        }
        return counter;
    }
    public static void main(String args[]){
        long n = 4;
        System.out.println(countSetBits(n));

    }
}
