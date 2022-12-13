import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class SubsetSums {
    private static void subsetSum(int ind,int sum,int[] arr,ArrayList<Integer> ans,int n ){
        if(ind == n){
            ans.add(sum);
            return;
        }
        //for taken condition
        subsetSum(ind+1, sum+arr[ind], arr, ans, n);
        //for not taken case
        subsetSum(ind+1,sum,arr,ans,n);

    }

    private static ArrayList<Integer> subsetSums(int arr[],int n){
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSum(0,0,arr,ans,arr.length);
        Collections.sort(ans);
        return ans;
    }
    private static void printArray(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n = 2;
        int arr[] = new int[]{2,3};
        ArrayList<Integer> res = subsetSums(arr,n);
        printArray(res);
         

    }
}
