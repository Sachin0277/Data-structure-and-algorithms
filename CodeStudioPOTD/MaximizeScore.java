public class MaximizeScore {
    private static int maximizeScore(int arr[],int n,int k){
        int sum = 0;
        int start = k-1,end = n-1;
        for(int i=0;i<=start;i++){
            sum += arr[i];

        }
        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans,sum);
        while(end != n-k-1){
            sum += arr[end];
            sum -= arr[start];
            ans = Math.max(sum,ans);
            end--;
            start--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 10,2,8,9,2};
        int n = arr.length;
        int k = 1;
        System.out.println(maximizeScore(arr,n,k));
    }   
}
