public class MinimumNumberRequired {

    private static int findMinNumber(int arr[],int sum, int maxVal){
        int curSum = 0;
        for(int ele : arr){
            curSum+=ele;
        }
        int requiredSum = Math.abs(curSum-sum);
        int numRequired = requiredSum/maxVal;
        if(requiredSum % maxVal > 0) numRequired++;
        return numRequired;
    }
    public static void main(String[] args) {
        int sum = 10, maxVal = 3;
        int arr[] = {2,-3,4};
        int ans = findMinNumber(arr,sum,maxVal);
        System.out.println(ans);
    }
}
