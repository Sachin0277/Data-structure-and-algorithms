import java.util.Arrays;
public class LexicographicallySmallest{
    private static int smallest(String s) {
        // Write your code here.
        int count = 0;
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(int i=0;i<s.length();i++){
            if(str[i] == s.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pxwzy";
        int ans = smallest(s);
        System.out.println(ans);
    }
}