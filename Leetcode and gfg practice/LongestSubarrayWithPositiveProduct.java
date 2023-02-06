public class LongestSubarrayWithPositiveProduct{
    private static int maxLength(int arr[],int n){
        int foundNeg = -1,foundZero = -1,neg = 0,max = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                neg++;
                if(foundNeg == -1){
                    foundNeg = i;
                }
            }
            if(arr[i] == 0){
                foundNeg = -1;
                foundZero = i;
            }
            if(neg % 2 == 0){
                max = Math.max(i-foundZero,max);
            }
            else{
                max = Math.max(i-foundNeg,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,-2,-3,-4};
        int n = arr.length;
        //call the function which will calculate the length of longest subarray with positive product
        int ans = maxLength(arr,n);
        System.out.println(ans);
    }
}