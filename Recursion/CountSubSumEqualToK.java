public class CountSubSumEqualToK {
    private static int countSub(int ind,int s , int[] arr,int sum,int n){
        if(ind == n){
            if(s == sum)
                return 1;
            else 
                return 0;
        } 
        s += arr[ind];
        int left = countSub(ind+1,s,arr,sum,n);
        s -= arr[ind];
        int right = countSub(ind+1,s,arr,sum,n);
        return left + right;
    }
    public static void main(String args[]){
        int n = 3;
        int[] arr = new int[]{1,2,1};
        int sum = 2;
        int res = countSub(0,0,arr,sum,n);
        System.out.println(res);

    }
}
