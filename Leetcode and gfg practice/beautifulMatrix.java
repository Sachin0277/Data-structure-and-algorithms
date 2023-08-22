public class beautifulMatrix {
    private static int minOperations(int n,int mat[][]){
        int sum1 = 0,sum2=0,max=0;
        for(int i=0;i<n;i++){
            sum1 = 0;
            sum2 = 0;
            for(int j=0;j<n;j++){
                sum1 += mat[i][j];
                sum2 += mat[j][i];
                max = Math.max(max,Math.max(sum1,sum2));
            }
        }
        sum1 = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            sum1 = 0;
            for(int j=0;j<n;j++){
               sum1 += mat[i][j];
            }
            ans += Math.abs(max-sum1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        int mat[][] = {{1, 2},{3, 4}};
        int ans = minOperations(n,mat);
        System.out.println(ans);
    }
}
