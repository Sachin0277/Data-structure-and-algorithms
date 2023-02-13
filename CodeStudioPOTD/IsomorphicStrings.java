import java.util.HashMap;

public class IsomorphicStrings {


    private static boolean isIsomorphicString(String str1,String str2 ){
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character,Integer>  map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(Integer i=0;i<str1.length();i++){
            if(map1.put(str1.charAt(i),i) != map2.put(str2.charAt(i),i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str1 = "aab";
        String str2 = "xxy";

        if(isIsomorphicString(str1,str2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
