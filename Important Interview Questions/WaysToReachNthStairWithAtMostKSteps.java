public class WaysToReachNthStairWithAtMostKSteps {
    private static int countWaysRecursion(int n,int m){
        if(n < 0) return 0;
        if(n == 0) {
            return 1;
        }
        int count = 0;
        for(int i=1;i<=m;i++){

            count += countWaysRecursion(n-i,m);//time complexity = O(m^n)
        }
        return count;
    }

    private static int countWaysDpMemo(int n,int m,int[] count){
        if(n < 0) return 0;
        if(n == 0) {
            return 1;
        }
        
       if(count[n] == 0){
        for(int i=1;i<=m;i++){

            count[n] += countWaysDpMemo(n-i,m,count);//time complexity = O(m^n)
        }
       }
        return count[n];
    }

    private static int countWaysDpOptimal(int n,int m){
        int count[] = new int[n+1];
        if(n == 1 || m == 1) return 1;
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;

        for(int i=3;i<=n;i++){
            count[i] = 0;
            for(int j=1;j<=m && (i-j) >= 0;j++){
                count[i] += count[i-j];
            }
        }
        return count[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        //call the function
        int ans = countWaysRecursion(n,m);
        System.out.println(ans);

        int count[] = new int[n+1];
        int ans1 = countWaysDpMemo(n,m,count);
        System.out.println(ans1);

        int ans2 = countWaysDpOptimal(n, m);
        System.out.println(ans2);

    }
}
