public class CheckIfOneStringIsRotationOfAnother {

    private static boolean isCR(String p, String q){
        int i = 0,j = 0, k = 0, n = p.length();
        boolean flag = false;
        while(i < 2*n){
            if(k == n) return true;
            if(p.charAt(i%n) == q.charAt(j%n)){
                i++;
                j++;
                k++;
            }
            else if(flag){
                flag = false;
                i++;
            }
            else{
                flag = true;
                j = 0;
                k = 0;

            }
        }
        return false;
    }

    private static int isCRUsingFunction(String p, String q){
        if((p.length() == q.length() && ((p+p).indexOf(q)) != -1)){
            return 1;
        }
        else{
            return 0;
        }
    }

    private static int isCyclicRotation(String p, String q){
        if(isCR(p,q)){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        String p = "abac";
        String q = "baca";

        int ans = isCyclicRotation(p,q);
        System.out.println(ans);

        int ans1 = isCRUsingFunction(p, q);
        System.out.println(ans);

    }
}
