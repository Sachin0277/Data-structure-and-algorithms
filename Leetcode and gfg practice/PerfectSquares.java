/*
 * Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some 
integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 */
public class PerfectSquares {
    //recursive method 
    private static int countSquare(int n){
        //base condition
        if(n <= 3)
            return n;
        int res = n;
        for(int i=1;i<=n;i++){
            int t = i*i;
            if(t > n)
                break;
            else
                res = Math.min(res,1+countSquare(n-t));
        }
        return res;
    }
    //optimization using dynamic programming
    private static int numOfSquares(int n){
        if(n <= 3) return n;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++){
            dp[i] = i;
            for(int j = 1;j <= Math.ceil(Math.sqrt(i));j++){
                int t = j*j;
                if(t > i){
                    break;
                }
                else{
                    dp[i] = Math.min(dp[i],1+dp[i-t]);
                }
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 12;
        System.out.println("The total count of squares which sum to given number is :"+countSquare(n));
       System.out.println("The total count of squares which sum to given number is :"+numOfSquares(n));
       
        
    }
    
}
