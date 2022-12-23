import java.util.ArrayList;
import java.util.Scanner;

public class TossStrangeCoins {
    public static double tossStrangeCoins(ArrayList<Double> prob, int target)
	{
		// Write your code here
        int n = prob.size();
        double dp[] = new double[target+1];
        dp[0] = 1.0;
        for(int i=0;i<n;i++){
            for(int j=Math.min(target,i+1);j >= 0 ;j--){
                if(j == 0){
                    dp[j]= dp[j]*(1-prob.get(i));
                 }
                else{
                    dp[j] = dp[j]*(1-prob.get(i));
                    dp[j] = dp[j] + (dp[j-1]*prob.get(i));
                }
            }
        }
        return dp[target];
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        ArrayList<Double> prob = new ArrayList<>();
        for(int i=0;i<n;i++){
            Double ele = sc.nextDouble();
            prob.add(i,ele);
        }
        //call function
        double ans = tossStrangeCoins(prob, target);
        System.out.println(ans);
        sc.close();
    }
}
