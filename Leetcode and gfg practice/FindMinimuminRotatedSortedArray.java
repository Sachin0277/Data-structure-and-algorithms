public class FindMinimuminRotatedSortedArray {

    private static int findMin(int nums[]){
        //using binary search
        int low = 0,high = nums.length-1;
        while(low < high){
            int mid = (low+high)/2;
            if(nums[mid] < nums[high]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return nums[low];
    }
    public static void main(String args[]){
        int n = 9;
        int nums[] = {6,5,4,0,1,2,3};
        int minimumElement = findMin(nums);
        System.out.println(minimumElement);

    }
}
