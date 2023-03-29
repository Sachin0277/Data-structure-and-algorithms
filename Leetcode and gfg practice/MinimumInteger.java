public class MinimumInteger{

    private static int minInteger(int a[]){
        long sum = 0;
        int n = a.length;
        for(int ele : a){
            sum += ele ;
        }
        long ans = Long.MAX_VALUE;
        for(int ele : a){
            if((long)n*ele <= sum){
                ans = Math.min((long)ele,sum);
            }
        }
        return (int)ans;
    }
    public static void main(String args[]){
        int n = 3;
        int a[] = {1,3,2};
        System.out.println(minInteger(a));

    }
}