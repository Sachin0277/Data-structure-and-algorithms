/*
 * You are given two integers 'N' and 'K' . Assume numbers from 1 to N are arranged such that all odd numbers (in ascending order) are present frist and all then come even numbers (also in ascending order) .
 * You need to find the integers at position 'K' (numbering of positions starts from 1).
 */
public class FindInteger {

    private static int findInteger(int n,int k){
        if(k <= (n+1)/2) return 2*k-1;
        else return 2*(k-((n+1)/2));
    }
    public static void main(String args[]){
        int n = 7;
        int k = 4;
        int ans = findInteger(n,k);
        System.out.println(ans);
    }
}
