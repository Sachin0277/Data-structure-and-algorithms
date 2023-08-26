import java.util.Arrays;

public class MaximumLengthOfPairChain {

    private static int maxLengthPairChain(int pairs[][]){
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1], b[1]));
        int cur = Integer.MIN_VALUE;
        int ans = 0;
        for(int[] pair : pairs){
            if(cur < pair[0]){
                cur = pair[1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int pairs[][] = {{1,2},{2,3},{3,4}};
        System.out.println(maxLengthPairChain(pairs));
    }
}
