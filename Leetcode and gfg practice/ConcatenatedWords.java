import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class ConcatenatedWords {

    private static List<String> findAllConcatenatedWordsInADict(String[] words){
        Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
        List<String> ans = new  ArrayList<>();
        HashSet<String> dict = new HashSet<>();
        for(String w: words){
            boolean dp[] = new boolean[w.length()+1];
            dp[0] = true;
            for(int i=1;i<=w.length();i++){
                for(int j=i;j>-1;j--){
                    if(dp[j] == true && dict.contains(w.substring(j,i))){
                        dp[i] = true;
                        break;
                    }
                }
            }
            if(w.length() > 0 && dp[w.length()]) ans.add(w);
            dict.add(w);
        }
        return ans;
    }
    public static void main(String args[]){
        String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        
        // calling the method which will return the string which are formed using two or more words in given array of word

        List<String> ans = findAllConcatenatedWordsInADict(words);
        
        //Displaying the output
        System.out.print("[ ");
        for(String s : ans){
            System.out.print(s+" "+",");
        }
        System.out.print(" ]");

    }
}
