// importing packages needed
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class MergeTwo2DArraysBySummingValues {

    //function which will merge two two-dimensional arrays by summing up values with same id and returns ans in increasing order of id
    private static int[][] mergeArrays(int[][] nums1,int[][] nums2){

        Map<Integer,Integer> map = new HashMap<>();

        for(int [][]nums : new int[][][]{nums1,nums2}){
            for(int[] pair: nums){
                int id = pair[0];
                int value = pair[1];
                map.put(id, map.getOrDefault(id,0)+value);
            }
        }
        int ans[][] = new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(ans, (a,b) -> Integer.compare(a[0],b[0]));
        return ans;
    }

    //print function
    private static void print(int[][] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.print(",");
        }
        System.out.print("]");
    }
    public static void main(String args[]){

        //input variables
        int [][]nums1 = {{1,2},{2,3},{4,5}};
        int [][]nums2 = {{1,4},{3,2},{4,1}};

        //output variables
        int[][] ans = mergeArrays(nums1,nums2);
        print(ans);
    }
}
