import java.util.Arrays;
public class MegaPrimes {
    private static boolean []primes = new boolean[8001];
    private static void sieve(int n){
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i*i<=n;i++){
            if(primes[i] == true){
                for(int j=i*i;j<=n;j+=i){
                    primes[j] = false;
                }
            }
        }

    }

    private static int countMegaPrimes(int left,int right){
        int cnt = 0;
        sieve(right);
        for(int i=left;i<=right;i++){
            int x = i;
            if(primes[x] == true){
                boolean flag = true;
                while(x > 0){
                    int r = x % 10;
                    x = x/10;
                    if(primes[r] != true){
                        flag = false;
                    }
                }

                if(flag == true) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        int left = 23;
        int right = 37;
        System.out.println(countMegaPrimes(left,right));
    }
}
