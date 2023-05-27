public class GcdOfStrings {

    private static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    private static String gcdOfStrings(String s1, String s2){
        if(!(s1+s2).equals(s2+s1)) return "";
        int hcfOfTwoStrings = gcd(s1.length(), s2.length());
        return s1.substring(0, hcfOfTwoStrings);
    }
    public static void main(String args[]){
        String s1 = "ABABAB";
        String s2 = "ABAB";
        System.out.println(gcdOfStrings(s1,s2));
        
    }
}
