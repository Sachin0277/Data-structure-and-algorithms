import java.util.ArrayList;
public class NumbersWithSameConsecutiveDifference{
    private static ArrayList<Integer> ans ;
    
    private static void helper(int num,int n,int k, ArrayList<Integer> ans){
        //base case
        if(n == 1){
            ans.add(num);
            return;
        }
        if((num%10+k) <= 9){
            helper(10*num+(num%10+k),n-1,k,ans);//recursive call for the next
        }
        if(k > 0){
            if((num%10-k) >= 0){
                helper(10*num+(num%10-k),n-1,k,ans); // recursive call for the previous
            }
        }
    }

    private static ArrayList<Integer> numbersWithSameConsecutiveDiff(int n,int k){
        ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            helper(i,n,k,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        //function call
        ArrayList<Integer> ans = numbersWithSameConsecutiveDiff(n,k);

        //printitng the result

        for(int ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();
        
    }
}