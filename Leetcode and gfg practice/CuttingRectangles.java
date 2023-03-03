import java.util.ArrayList;
public class CuttingRectangles{
    private static long gcd(long a, long b){
        if(a == 0){
            return b;
        }
        else return gcd(b%a, a);
    }
    static long lcm (long a, long b){
        return a*(b/gcd(a,b));
    }
    static ArrayList<Long> minimumSquares(long L, long B)
    {
        
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(lcm(L,B)/gcd(L,B));
        ans.add(gcd(L,B));
        return ans;
        
        
    }
    public static void main(String args[]){
        long l = 6 , b = 3;
        ArrayList<Long> ans = minimumSquares(l,b);
        System.out.println(ans.get(0));
        System.out.println(ans.get(1)); 
    }
}