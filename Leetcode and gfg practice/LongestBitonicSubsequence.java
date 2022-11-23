/*
 * Given an array of positive integers. Find the maximum length of Bitonic subsequence. 
 * A subsequence of array is called Bitonic if it is first strictly increasing, then strictly decreasing.
 */
import java.util.Arrays;
public class LongestBitonicSubsequence{
    /*
     * Method to find the length of the longest bitonic subsequence
     */
    private static int longestBitonicSubsequence(int[] arr){
        int n = arr.length;
        //longest increasing subsequence
        int idp[] = new int[n];
        Arrays.fill(idp,1);
        for(int i=1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(arr[i] > arr[j])
                idp[i] = Math.max(idp[i],1+idp[j]);
            }
        }
        //longest decreasing subsequence

        int ddp[] = new int[n];
        Arrays.fill(ddp,1);
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>=i;j--){
                if(arr[i] > arr[j])
                    ddp[i] = Math.max(ddp[i],1+ddp[j]);
            }
        }
        int maxLen = 0;
        for(int i=0;i<n;i++){
            maxLen = Math.max(maxLen,(idp[i]+ddp[i]-1));
        }
        return maxLen;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,3,2};
        int ans = longestBitonicSubsequence(arr);
        System.out.println("The length of the longest bitonic subsequence is " + ans);
    }
}