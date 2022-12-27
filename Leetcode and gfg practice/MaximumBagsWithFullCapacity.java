import java.util.Arrays;
public class MaximumBagsWithFullCapacity{
    private static int maximumBags(int capacity[],int rocks[],int additionalRocks){
        for(int i=0;i<capacity.length;i++){
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int cnt = 0;
        for(int i=0;i<capacity.length && additionalRocks > 0;i++){
            if(capacity[i] <= additionalRocks){
                cnt++;
            }
            additionalRocks -= capacity[i];
        }
        return cnt;
    }
    public static void main(String args[]){
        int capacity[] = {2,3,4,5};
        int rocks[] = {1,2,4,4};
        int additionalRocks = 2;
        int n = maximumBags(capacity , rocks, additionalRocks);
        System.out.println(n);
    }
}