import java.util.Arrays;
public class JumpsII{


    //using dynamic programming concept
    private static int jumps(int nums[]){
        int n = nums.length;
        int[] jumps = new int[n];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        jumps[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= nums[i] && i + j < n; j++) {
                jumps[i + j] = Math.min(jumps[i + j], jumps[i] + 1);
            }
        }
        return jumps[n - 1];
    }

    //using the concept of dynamic programming to linear time complexity 
    private static int minJumps(int nums[]){
        int minJump = 0 , preDist = 0, farDist = 0;
        for(int i=0;i<nums.length-1;i++){
            farDist = Math.max(farDist, i+nums[i]);
            if(i == preDist){
                minJump++;
                preDist = farDist;
                if(preDist >= nums.length-1){
                    break;
                }
            }
        }
        return minJump;
    }
    public static void main(String args[]){
        int nums[] = {2,3,1,1,4};

        int ans = jumps(nums);
        System.out.println(ans);
        int res = minJumps(nums);
        System.out.println(res);
    }
}