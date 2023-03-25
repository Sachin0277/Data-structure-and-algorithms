import java.util.ArrayList;

public class SubQueriesSum {

    private static ArrayList<Integer> findSubMatrixSum(int arr[][],int queries[][]){
        int x = queries.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<x;i++){
            int sum = 0;
            for(int j=queries[i][0];j<=queries[i][2];j++){
                for(int k=queries[i][1];k <= queries[i][3];k++){
                    sum += arr[j][k];
                }
            }
            ans.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2, m = 2, k = 1;
        int[][] arr = new int[n][m];
        int queries[][] = new int[k][4];
        arr = new int[][]{{4,2},{1,3}};
        queries = new int[][]{{0,0,1,0}};
        
        //call the function findSubmatrixSum
        ArrayList<Integer> ans = findSubMatrixSum(arr,queries);
        for(int i : ans){
            System.out.print(i + " ");
        }

        
    }
}
