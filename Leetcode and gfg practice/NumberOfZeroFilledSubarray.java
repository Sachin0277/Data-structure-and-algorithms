public class NumberOfZeroFilledSubarray {

    private static int zeroFilledSubarray(int arr[]){
        int countZero = 0;
        int numberOfSubarrayFilledWithZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                countZero++;
            }
            else{
                numberOfSubarrayFilledWithZero += (countZero*(countZero+1)/2);
                countZero = 0;
            }
        }
        if(countZero > 0){
            numberOfSubarrayFilledWithZero += (countZero*(countZero+1)/2);
        }
        return numberOfSubarrayFilledWithZero;
    }
    public static void main(String args[]){
        int arr[] = {1,3,0,0,2,0,0};
        int ans = zeroFilledSubarray(arr);
        System.out.println(ans);
    }
}
