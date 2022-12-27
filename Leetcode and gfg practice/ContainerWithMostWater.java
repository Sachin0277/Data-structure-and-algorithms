public class ContainerWithMostWater {
    private static long maxArea(int arr[]){
        int s = 0,e = arr.length-1;
        long ans = 0,res = 0;
        while(s < e){
            if(arr[s] <= arr[e]){
                ans = arr[s]*(e-s);
                s++;
            }
            else{
                ans = arr[e]*(e-s);
                e--;
            }
            if(ans > res){
                res = ans;
            }
           
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,5,4,3};
        long ans = maxArea(arr);
        System.out.println(ans);
    }
}
