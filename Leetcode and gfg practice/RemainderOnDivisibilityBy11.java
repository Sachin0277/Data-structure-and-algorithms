public class RemainderOnDivisibilityBy11 {


    private static int xmod11(String x){
        int s = 0;
        for(int i=0;i<x.length();i++){
            s = (s*10+(x.charAt(i)-'0'))%11;
        }
        return s;
    }
    public static void main(String[] args) {
        String x = "1345";
        int ans = xmod11(x);
        System.out.println(ans);
    }
}
