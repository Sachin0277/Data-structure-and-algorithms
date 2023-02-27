

public class MinimumNumbersOfJumps {

    private static int minJumps(int arr[]){
        int jumps = 0;
        int step = 0;
        int maxReach = 0;
        for(int i=0;i<arr.length-1;i++){
            maxReach = Math.max(maxReach, i+arr[i]);
            if(i == step){
                jumps++;
                step = maxReach ;
            }

        }
        if(step < arr.length-1){
            return -1;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr1[] = {1, 4, 3, 2, 6, 7};
        int ans = minJumps(arr);
        int ans1 = minJumps(arr1);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
