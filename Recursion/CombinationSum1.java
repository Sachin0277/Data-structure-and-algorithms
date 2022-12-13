import java.util.*;
 public class CombinationSum1 {
    //helper function for driver function 
    private static void findCombinationSum(int ind,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        // base condition
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //taken condition 
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinationSum(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        //not taken condition
        findCombinationSum(ind+1, arr, target, ans, ds);
    }
    //driver function
    private static List<List<Integer>> combinationSum(int candidates[],int target){
        List<List<Integer>> res = new ArrayList<>();
        findCombinationSum(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    //to print result
    private static void printList(List<List<Integer>> arrayList){
        System.out.println(arrayList);
    }
    public static void main(String args[]){
        // int candidates[] = new int[]{2,3,6,7};
        // int target = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int candidates[] = new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
            candidates[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        List<List<Integer>> ans =  combinationSum(candidates,target);
        printList(ans);
        sc.close();
    }
}
/*
 * Striver's video lecture reference (My role model for being a software engineer)
 */
