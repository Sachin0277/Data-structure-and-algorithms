import java.util.*;
public class CombinationSum2 {
    
 
    //helper function for driver function 
    private static void findCombinationSum(int ind,int[] candidates,int target,List<List<Integer>> res, ArrayList<Integer> ds){
        //base condition
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i > ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            ds.add(candidates[i]);
            findCombinationSum(i+1,candidates,target-candidates[i],res,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
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
        List<List<Integer>> ans =  combinationSum2(candidates,target);
        printList(ans);
        sc.close();
    }
}
/*
 * Striver's video lecture reference (My role model for being a software engineer)
 */


