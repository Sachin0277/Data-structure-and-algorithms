public class OneStringIsRotationOfOther {


    private static int isCyclicRotation(String p,String q){
        if(p.length() != q.length()) return 0;
        //concatenate first string with it self and check if second string is present in first or not
        p = p.concat(p);
        if(p.indexOf(q) != -1) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        String p = "abac";
        String q = "baca";
        int ans = isCyclicRotation(p,q);
        System.out.println(ans);
    }
}
