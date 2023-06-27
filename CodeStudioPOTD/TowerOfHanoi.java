import java.util.*;


public class TowerOfHanoi {
    private static void recur(int n, ArrayList<ArrayList<Integer>> ans, int src,int aux ,int dest){
        if(n == 0) return;
        recur(n-1,ans,src,dest,aux);
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(src);
        ls.add(aux);
        ans.add(ls);
        recur(n-1,ans,dest,aux,src);
    }

    private static ArrayList<ArrayList<Integer>> towerOfHanoi(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src = 1, aux = 2,dest = 3;
        recur(n,ans,src,aux,dest);
        return ans;
    }
    public static void main(String args[]){
        int n = 3;
        ArrayList<ArrayList<Integer>> ans = towerOfHanoi(n);
        for(ArrayList<Integer> l : ans){
            System.out.println(l);
        }
    }
}
