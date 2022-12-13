import java.util.ArrayList;

public class PrintSubsequencesSumEqualToK{
    private static void printSubSumEqualToK(int i,ArrayList<Integer> ans,int s, int sum,int arr[],int  n){
        if(i == n){
            if(s == sum && ans.size() > 0){
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[i]);
        s += arr[i];
        printSubSumEqualToK(i+1, ans,s, sum, arr, n);
        ans.remove(ans.size()-1);
        s -= arr[i];
        printSubSumEqualToK(i+1, ans, s, sum, arr, n);

    }
    public static void main(String args[]){
        int n = 3;
        int arr[] = new int[]{1,2,1};
        int sum = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        printSubSumEqualToK(0,ans,0,sum,arr,n);
    }
}