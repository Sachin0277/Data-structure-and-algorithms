import java.util.*;

public class WordPattern {

    private static boolean patternChecker(String p,String s){
        String words[] = s.split(" ");//spliting the string as array of element (words as elements)
        if(p.length() != words.length)
            return false;
        Map map = new HashMap();
        for(Integer i = 0;i<p.length();i++){
            if(map.put(p.charAt(i),i) != map.put(words[i],i))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        
        String pattern = "abba";
        String s = "dog cat cat bat";

        if(patternChecker(pattern,s)){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }
    }
    
}
