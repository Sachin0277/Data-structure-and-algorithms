import java.util.ArrayList;

public class CrazyNumbers {

    private static ArrayList<ArrayList<Integer>> numberPattern(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>(n));
            for(int j=0;j<n;j++){
                ans.get(i).add(-1);
            }
            
        }
        int k = 1;
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j<n;j++){
                if(k > 9){
                    k = 1;
                }
                ans.get(i).set(j,k);
                k++;
            }
        }
        return ans;
    }


    private static void print(ArrayList<ArrayList<Integer>> arrList){
        for(ArrayList<Integer> ls : arrList){
            System.out.println(ls);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        /*
         * print the pattern as follows
         *     1
         *    23
         *   456
         *  7891
         * Note : for space it must contains -1
         */

         ArrayList<ArrayList<Integer>> ans = numberPattern(n);
         print(ans);
    }
}
