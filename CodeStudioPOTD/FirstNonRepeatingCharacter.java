import java.util.HashMap;
public class FirstNonRepeatingCharacter {
    private static char firstNonRepeatingCharacter(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) == 1) return s.charAt(i);
        }
        return '#';
    }
    public static void main(String[] args) {
        String str = "abcabd";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}
