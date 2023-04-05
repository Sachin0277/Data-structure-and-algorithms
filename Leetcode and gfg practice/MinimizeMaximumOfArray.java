public class MinimizeMaximumOfArray {

    private static int minimizeArrayValue(int[] nums){
        long sum = 0, minArrVal = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            minArrVal = Math.max(minArrVal,(sum+i)/(i+1));
        }
        return (int)minArrVal;
    }
    public static void main(String args[]){
        int nums[] = {3,7,1,6};
        int ans = minimizeArrayValue(nums);
        System.out.println(ans);
    }
    
}
