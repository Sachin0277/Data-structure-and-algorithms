import java.util.HashSet;
public class MirrorString {
    
    
    private static Boolean isPal(String s){
        int l = 0;
        int r = s.length()-1;
        while(l++ < r--){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
    public static Boolean isReflectionEqual(String s) {
        HashSet<Character> set = new HashSet<>();
        String symmetricString = "AHIMOTUVWXY";
        for(int i=0;i<symmetricString.length();i++){
            set.add(symmetricString.charAt(i));
        }
        //now check if all the character of the string s is symmetric string or not if not reutrn false
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)))
                return false;
        }
        //if string contains all symmetric string then check if it is palindrome or not
        if(!isPal(s)) return false;
        else return true;
    }
    public static void main(String args[]){
        //input string 
        String s = "ITDTI";
        //output
        System.out.println(isReflectionEqual(s));
    }
}
