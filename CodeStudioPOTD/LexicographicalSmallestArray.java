// package CodeStudioPOTD;


public class LexicographicalSmallestArray {
    /*
     * Method for finding the lexicographically smallest array 
     */
    /**
     * @param arr
     * @param k
     * @return
     */
    private static int[] lexicographicalSmallestAfterKSwaps(int[] arr, int k) {
        for(int i=0;i<arr.length-1 && k > 0 ;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(j-i > k) break;
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            
            for(int j = minIndex;j > i;j--){
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
            }
            k -= minIndex-i;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{70,60,90,21,11};
        int k = 3;

        /*
         * calling method which will find the lexicographical smallest array
         */
        int updatedArr[] = lexicographicalSmallestAfterKSwaps(arr,k);
        System.out.println("The lexicographical smallest array after at most k consecutive swaps :");
        for(int i=0;i<updatedArr.length;i++){
            System.out.print(updatedArr[i]+" ");
        }
    }
}
