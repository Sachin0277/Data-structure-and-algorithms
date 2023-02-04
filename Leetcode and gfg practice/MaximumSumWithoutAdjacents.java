 import java.util.Arrays;
 public class MaximumSumWithoutAdjacents{
    //function using recursion to find the maximum sum subsequences
    private static int recur(int arr[],int n,int i,int dp[]){
        //base conditions
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        
        //there are two options either to select the next element or not 
        int first = recur(arr,n,i+1,dp); //not considering the cur element arr[i]
        int second = arr[i]+recur(arr,n,i+2,dp);

        //find the maximum of both and memoize it 
        int max = Math.max(first,second);
        dp[i] = max;
        
        return max;
    }
    private static int findMaxSum(int arr[] ,int n){
        int res = 0,max1 = 0,max2 = 0;
        for(int i=0;i<n;i++){
            int curSum = arr[i]+max1;
            max1 = Math.max(max1,max2);
            max2 = Math.max(max2,curSum);
            res = Math.max(res,curSum);
        }
        return res;
    }

    //function which will give the maximum sum subsequences without adjacent 
    private static int findMaxSumUsingDp(int arr[],int n){
        //create an array of n+1 which will memoize the ans for each iterations
        int dp[] = new int[n+1];
        //fill the dp array initially with -1
        Arrays.fill(dp,-1);
        return recur(arr,n,0,dp);

    }
    public static void main(String args[]){
        //input parameters
        int arr[] = {5,5,10,100,10,5};
        int n = arr.length;
        //output parameters 
        int ans = findMaxSumUsingDp(arr,n);
        int ans1 = findMaxSum(arr,n);
        System.out.println("With dp: "+ ans);
        System.out.println("Without dp: "+ans1);

    }
 }