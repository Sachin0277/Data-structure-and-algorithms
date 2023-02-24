
/*
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 */


public class MinimalLengthContiguousSubarray {


    private static int minLength(int arr[],int s){
        int l = 0,r = 0;
        int n = arr.length;
        int minimalLen = Integer.MAX_VALUE;
        int subSum = 0;
        while(r < n){
            subSum += arr[r];
            while(subSum >= s){
                minimalLen = Math.min(minimalLen,r-l+1);
                subSum -= arr[l];
                l++;
            }
            r++;
        }
        return minimalLen == Integer.MAX_VALUE ? 0 : minimalLen;
    }
    public static void main(String[] args) {
        // Input Management
        int arr[] = {2,1,7,9,12};
        int s = 10;

        //output management

        int minLenContiguousSubarray = minLength(arr,s);
        System.out.println(minLenContiguousSubarray);
    }
}
