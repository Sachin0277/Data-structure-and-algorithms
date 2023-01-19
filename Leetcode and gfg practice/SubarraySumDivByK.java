import java.util.HashMap;
public class SubarraySumDivByK{
    private static int subArraySumDivByK(int nums[],int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cnt = 0;
        int sum = 0;
        for(int ele : nums){
            sum = (sum+ele)%k;
            if(sum < 0) sum += k;
            cnt += hm.getOrDefault(sum,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
    public static void main(String args[]){
        int nums[] = {4,5,0,-2-3,1};
        int k = 5;
        int ans = subArraySumDivByK(nums,k);
        System.out.println(ans);
    }
}