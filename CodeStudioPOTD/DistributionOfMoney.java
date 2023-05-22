public class DistributionOfMoney {
    private static int minTransactions(int arr[],int n,int k){
        int sum = 0;
        for(int ele : arr) sum += ele;
        if(sum < k) return 0;
        if(sum % arr.length != 0) return -1;
        int avg = sum / arr.length;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int change = avg-arr[i];
            if(change % k != 0) return -1;
            if(change > 0){
                count += change/k;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] ={ 4,6,6,8};
        int k= 2;
        int n = arr.length;
        System.out.println(minTransactions(arr,n,k));
    }
}
