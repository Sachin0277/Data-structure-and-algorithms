public class EqualLeftAndRightSubarraySum {


    private static int equalSum(int a[],int n){
        int i=0,j=n-1,ans = -1;
        int l = a[0],r=a[n-1];
        // a base case 
        if(n == 1) return 1;
        while(i <= j){
            if(l == r){
                if(i == j){
                    ans = Math.max(ans,i+1);
                }
                i++;
                j--;
                l += a[i];
                r += a[j];

            }
            else if(l < r){
                i++;
                l += a[i];
            }
            else{
                j--;
                r += a[j];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int n = 5;
        int a[] = {1,3,5,2,2};
        //Expected Output : 3
        /*
         * There are many approaches some of them are listed below:
         * 1. Prefix and suffix sum 
         * 2. a modification of prefix and suffix summ
         * 3. Two pointer approach(I will be doing two pointer approach)
         */

         System.out.println(equalSum(a,n));

    }
}
