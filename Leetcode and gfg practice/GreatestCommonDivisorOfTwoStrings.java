public class GreatestCommonDivisorOfTwoStrings {
    private static int gcd(int a,int b){
        if(a == 0) return b;
        return gcd(b%a,a);
    }
    private static String gcdOfTwoStrings(String a,String b){
        if(!(a+b).equals(b+a)) return "";
        int ind = gcd(a.length(),b.length());
        return a.substring(0,ind);
    }
    public static void main(String args[]){
        String a= "ABABAB";
        String b = "ABAB";
        //calling function that will return the string which will divide both the strings
        String ans = gcdOfTwoStrings(a,b);
        System.out.println(ans);

    }
}
