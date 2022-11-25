import java.util.HashMap;

/*
 * You are given an array arr of n integers and a non negative integer k your task is to find if there exits two indices i and j such 
 * that arr[i] - arr[j] = k given i is not equal to j itf there exit such indices you have to return true else you have to return false.
 * According to the return value, yes or no will be printed ,yes for true and no for false.
 */
public class CheckDifference {
    public static boolean checkDiff(int[] arr,int n,int k ){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]-k) && hm.get(arr[i]-k) != i){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
            int arr[] = {6,1,3};
            int n = arr.length;
            int k = 7;
            if(checkDiff(arr,n,k)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
    }
    
}
