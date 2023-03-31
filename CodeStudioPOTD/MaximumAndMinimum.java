import java.util.ArrayList;

public class MaximumAndMinimum {
    
    private static ArrayList<Integer> findMaxMin(int x, int y){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = x+((x-y)&((x-y) >> 31));
        int min = y-((x-y) & ((x-y) >> 31));
        ans.add(min);
        ans.add(max);
        return ans;
    }
    public static void main(String[] args) {
        int a = 17,b=13;
        ArrayList<Integer> ans = findMaxMin(a,b);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
