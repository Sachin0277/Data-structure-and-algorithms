/*
 * It is one of the best problem based on binary search which gives us the concept of implementation of binary search
 * This question have been asked in alot of companies in recruitement process
 * Intuition : Array is sorted and then rotated which means we can use binary search because we know that binary search 
 * can be applied only if the array is sorted .In this case it is not purely sorted because after sorting it has been 
 * rotated but if we think logically it will be a simpler problem
 */

public class seachInSortedArray {
    private static int search(int arr[],int target){
        int low = 0,high = arr.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && arr[mid] > target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] < target && arr[high] >= target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        

        int n = search(arr,target);
        System.out.println("The element " +target+ " is present at the index "+n);
    }
}
