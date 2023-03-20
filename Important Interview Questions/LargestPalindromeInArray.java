import java.util.Arrays;
public class LargestPalindromeInArray {

    //  This is bruteforce approach here the time complexity is o(nlogn) so we need to optimize it 
    
    private static int largestPal(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(isPal(arr[i])){
               ans = arr[i];
               break;
            }
        }
        return ans;
    }

    private static boolean isPal(int n){
        int rev = 0;
        int org = n;
        while(n > 0){
            rev  = rev*10+(n%10);
            n /= 10;
        }
        if(org == rev) return true;
        else return false;

    }

    private static int palLarge(int arr[]){
        int curMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > curMax && isPal(arr[i])){
                curMax = arr[i];
            }
        }
        return curMax;
    }
    private static boolean pal(int n){
        int div = 1;
        while(n/div >= 10){
            div *= 10;
        }
        while(n != 0){
            int leading = n/div;
            int trailing = n%10;
            if(leading != trailing){
                return false;
            }
            n = (n%div)/10;
            div = (div)/100;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {11,54545,321};

        int ans = palLarge(arr);
        System.out.println(ans);

    }
}
