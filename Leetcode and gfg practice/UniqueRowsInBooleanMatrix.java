import java.util.ArrayList;
import java.util.HashSet;

public class UniqueRowsInBooleanMatrix {

    private static ArrayList<ArrayList<Integer>> uniqueRows(int matrix[][],int row,int col){
        HashSet<String> hs = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<row;i++){
            ArrayList<Integer> ls = new ArrayList<>();
            String s = "";
            for(int j=0;j<col;j++){
                ls.add(matrix[i][j]);
                s += matrix[i][j];
            }
            if(hs.add(s)){
                ans.add(ls);
            }
        }

        return ans;
    }
    public static void main(String args[]){
        int row = 3,col = 4;
        int matrix[][] = {{1,1,0,1},{1,0,0,1},{1,1,0,1}};
        ArrayList<ArrayList<Integer>> ans = uniqueRows(matrix,row,col);
        for(ArrayList<Integer> ls : ans){
            System.out.println(ls);
        }

    }   
}
