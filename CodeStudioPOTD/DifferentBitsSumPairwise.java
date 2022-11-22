public class DifferentBitsSumPairwise {
    private static int differenceBitSum(int arr[]){
        int res = 0;
        for(int i=0;i<32;i++){
            int cnt = 0;
            for(int j=0;j<arr.length;j++){
                if((arr[j] & (1 << i))!=0)
                    cnt++;
            }
            res += (cnt * (arr.length - cnt ) * 2);
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,2};
        int arr1[] = {1,3,5};

        int ans = differenceBitSum(arr);
        System.out.println(ans);
        System.out.println(differenceBitSum(arr1));
    }
}
