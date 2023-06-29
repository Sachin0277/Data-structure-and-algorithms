public class NextHappyNumber {
    private static boolean isHappy(long n){
        //base condition 
        if(n == 1 || n == 7) return true;
        if(n < 10) return false;
        //recursive step
        long sum = 0;
        while(n > 0){
            long r = n%10;
            sum += (r*1L*r);
            n/=10;
        }
        return isHappy(sum);
    }

    private static long nextHappyNumber(long n){
        n++;
        while(true){
            if(isHappy(n)){
                return n;
            }
            else n++;
        }
    
    }
    public static void main(String args[]){
        long n = 8;
        System.out.println(nextHappyNumber(n));
    }
}
