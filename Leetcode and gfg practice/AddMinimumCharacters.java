public class AddMinimumCharacters {

    private static int minChar(String s){
        int n = s.length();
        int i=0,j = n-1,ans = n-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                i=0;
                ans--;
                j = ans;
            }
        }
        return n-ans-1;
    }
    public static void main(String args[]){
        String s = "ABAB";
        System.out.println(minChar(s));

    }
}
