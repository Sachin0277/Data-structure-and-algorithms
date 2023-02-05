import java.util.ArrayList;
public class CombinationSumIII {
    private static void backtrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> pc,int k,int s,int n){
        if(pc.size() > k) return;
        if(pc.size() == k && n == 0){
            ArrayList<Integer> ls = new ArrayList<>(pc);
            ans.add(ls);
            return;
        }
        for(int i=s;i<=9;i++){
            pc.add(i);
            backtrack(ans, pc, k, i+1, n-i);
            pc.remove(pc.size()-1);
        }
    }

    private static ArrayList<ArrayList<Integer>> combinationSum(int k,int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(),k,1,n);
        return ans;
    }

    public static void main(String args[]){
        int k = 3;
        int n = 7;

        ArrayList<ArrayList<Integer>> ans = combinationSum(k,n);

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
        }
    }
    
}
