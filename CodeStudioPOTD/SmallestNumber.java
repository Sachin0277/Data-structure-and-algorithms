public class SmallestNumber {
    private static String smallestNumber(int n, int k){
        StringBuilder sb = new StringBuilder();
        if(n == 0){
            return k == 1? "0":"-1";
        }
        if(k > 9*n) return "-1";
        k--;
        for(int i=1;i<n;i++){
            if( k > 9){
                sb.append(9);
                k -= 9;
            }
            else{
                sb.append(k);
                k = 0;
            }
        }
        sb.append(k+1);
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        int n = 5;
        int k = 4;

        System.out.println(smallestNumber(n,k));
    }
}
