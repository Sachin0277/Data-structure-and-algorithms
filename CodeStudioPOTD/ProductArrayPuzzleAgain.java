import java.util.Arrays;
public class ProductArrayPuzzleAgain {
    private static int mod = (int)Math.pow(10,9)+7;
    public static int[] productPuzzle(int[] arr, int n) {
        int[] res = new int[n];
        Arrays.fill(res,1);
        long l = 1,r = 1;
        for(int i=0;i<n;i++){
            res[i] = (int)((res[i]*l)%mod);
            l = ((l*arr[i])%mod);
            res[n-i-1] = (int)((res[n-i-1]*r)%mod);
            r = ((r*arr[n-i-1])%mod);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,3,10,2};
        int n = arr.length;
        int ans[] = productPuzzle(arr, n);
        for(int ele : ans){
            System.out.print(ele+" ");

        }
    }
}
