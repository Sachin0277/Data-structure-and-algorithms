import java.util.ArrayList;
import java.util.Collections;
public class codeSequence {
    private static void recur(long i,long n,ArrayList<Long> ans){
        //base case
        if(i > n) return ;
        if(i != 0) ans.add(i);
        recur(i*10+2,n,ans);
        recur(i*10+5,n,ans);
        
    }

    private static ArrayList<Long> createSequence(long n){
        ArrayList<Long> ans = new ArrayList<>();
        //call the recur function 
        recur(0l,n,ans);
        //to print in order
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        long n = 50;
        ArrayList<Long> ans = createSequence(n);
        for(long ele : ans){
            System.out.print(ele+" ");
        }
    }
    
}
