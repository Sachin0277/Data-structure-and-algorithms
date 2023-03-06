public class KthMissingPositiveNumber {

    private static int findKthPositiveLinear(int[] arr, int k){
        //linear time complexity solution 
        for(int ele : arr){
            if(ele <= k) k++;
            else break;
        }   
        return k;
    }

    private static int  binarySearch(int arr[],int k){
        int low = 0, high = arr.length;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid]-1-mid < k ) low = mid+1;
            else high = mid;
        }
        return low + k;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,7,11};
        int k = 5;
        int ans = findKthPositiveLinear(arr,k);
        System.out.println(ans);
        int ans1 = binarySearch(arr, k);
        System.out.println(ans1);
    }
}
