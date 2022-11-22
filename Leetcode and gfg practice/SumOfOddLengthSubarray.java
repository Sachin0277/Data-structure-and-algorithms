public class SumOfOddLengthSubarray {
    private static int sumOfOddLengthSubarray(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += ((i+1)*(n-i)+1)/2*arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1,4,2,5,3};
        int sum = sumOfOddLengthSubarray(arr);
        System.out.println("The sum of the odd length subarray is: " + sum);
    }
}
