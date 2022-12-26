/*
 * Akku likes binary numbers and she likes playing with these numbers. Her teacher once gave her a question.
 * For given value of  L and R, Akku have to find the count of number X, which have only three-set bits in 
 * it's binary representation such that "L ≤ X ≤ R".Akku is genius, she solved the problem easily. Can you do it ??
 */
public class AkkuAndBinaryNumber {
    private static long solve(long L , long R){
        int ans = 0;
        for(int i=0;i<64;i++){
            for(int j=i+1;j<64;j++){
                for(int k=j+1;k<64;k++){
                    long temp = 0;
                    temp = temp | (1L << i);
                    temp = temp | (1L << j);
                    temp = temp | (1L << k);
                    if(temp >= L && temp <= R) ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        long L=11,R = 19;
        long out = solve(L , R);
        System.out.println(out);

    }
}
