import java.util.ArrayList;

public class FindTheEvilMonsters {
   
        private static long[] solve(int[][] A, int[][] B) {
            long totalMon = 0;
            ArrayList<Long> ans = new ArrayList<>();
            for(int i=0;i<A.length;i++){
                totalMon += A[i][1]-A[i][0]+1;
            }
            for(int k=0;k<B.length;k++){
            
                
                for(int i=0;i<A.length;i++){
                        if(B[k][0] > A[i][0] && B[k][0] <= A[i][1] && B[k][1] >= A[i][2]){
                                totalMon -= 1;
                        }
                }
                ans.add(totalMon);
            }
            int i=0;
            long res[] = new long[ans.size()];
            for(long ele : ans){
                res[i++] = ele; 
            }
            return res;
        }
    
    
    public static void main(String[] args) {

        int A[][] = {{1,3,7},{2,5,4},{4,8,6}};
        int B[][] = {{3,5},{5,8}};

        int A1[][] = {{2,5,8},{5,8,6},{3,6,9},{7,10,10}};
        int B1[][] = {{2,7},{7,9},{7,11}};
        long[] ans = solve(A,B);
        for(long ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();
        long[] ans1 = solve(A1,B1);
        for(long ele : ans1){
            System.out.print(ele+" ");
        }
    }
}
