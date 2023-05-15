public class FindMinimumInRotatedSortedArrayII{

    private static int minInSortedRotatedArray(int nums[]){

        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }
            else if(nums[mid] < nums[low]){
                low++;
                high = mid;
            }
            else
                high--;
        }
        return nums[low];
    }
    public static void main(String args[]){
        int nums[] = {2,2,2,3,1};
        System.out.println(minInSortedRotatedArray(nums));

    }
}