import java.util.*;
public class UniquePartition {
    private static ArrayList<ArrayList<Integer>> res;
    private static ArrayList<Integer> ls;
    private static void dfs(int m,int n, ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ls){
        if(n == 0){
            res.add(new ArrayList<>(ls));
            return ;
        }
        for(int i=m;i>=1;i--){
            if(n-i >= 0){
                ls.add(i);
                dfs(n-i,i,res,ls);
                ls.remove((Integer)i);
            }
        }
       
    }
    public static void main(String args[]){
        int n = 3;
        res = new ArrayList<>();
        ls = new ArrayList<>();
        dfs(n,n,res,ls);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(0).size();i++){
                System.out.print(res.get(i).get(j)+ " ");
            }
            
        }
    }
}
