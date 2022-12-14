import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SubsetsII {
    private static void findSubSet(int ind,int[] arr,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> ds){
        res.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            findSubSet(i+1, arr, res, ds);
            ds.remove(ds.size()-1);
        }
    }
    private static ArrayList<ArrayList<Integer>> subSet(int arr[]){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findSubSet(0,arr,ans,new ArrayList<>());
        return ans;
    }
    private static void printList(ArrayList<ArrayList<Integer>> ls){
       System.out.println(ls);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of N:");
        int n = sc.nextInt();
        System.out.println("Enter element of the set:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // function call 
        ArrayList<ArrayList<Integer>> list = subSet(arr);
        printList(list);


    }
}
