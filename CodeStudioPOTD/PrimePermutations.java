import java.util.Arrays;
public class PrimePermutations {

    private static final int mod = (int)Math.pow(10,9)+7;

    private static int primePermutations(int n){
        //sieveOfEratoshtenes
        boolean primes[] = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i*i<=n;i++){
            if(primes[i]){
                for(int j=i;j*i<=n;j++){
                    primes[j*i] = false;
                }
            }
        }
        //find the numbers of primes number in range 1 to n
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(primes[i]){
                cnt++;
            }
        }
        //permuatations of prime numbers 
        int res = 1;
        for(int i=1;i<=cnt;i++){
            res = (int)((1L*res*i)%mod);
        }
        for(int i=1;i <=(n-cnt);i++){
            res = (int)((1L*res*i)%mod);
        }
        return res;

    }
    public static void main(String arg[]){
        int n = 3;
        int n1 = 5;
        System.out.println(primePermutations(n));
        System.out.println(primePermutations(n1));
    }
}
