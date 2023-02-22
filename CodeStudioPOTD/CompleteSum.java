public class CompleteSum {

    private static int[] completeSum(int arr[],int n){
        int compSum[] = new int[n];
        compSum[0] = arr[0];
        for(int i=1;i<n;i++){
            compSum[i] = compSum[i-1]+arr[i];
        }
        return compSum;
    }

    private static void print(int []arr){

        System.out.print("[");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        int ans[] = completeSum(arr,n);
        print(ans);
    }
}
