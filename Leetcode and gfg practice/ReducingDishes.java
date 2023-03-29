import java.util.Arrays;
public class ReducingDishes {

    private static int maxSatisfaction(int satisfaction[]){
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int preSum = 0;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            preSum += satisfaction[i];
            if(preSum < 0){
                break;
            }
            ans += preSum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int satisfaction[] ={-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(satisfaction));
    }
}
