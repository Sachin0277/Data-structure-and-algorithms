import java.util.ArrayList;
import java.util.*;
class Trie{
    Trie arr[] = new Trie[26];
    boolean isComp = false;
}
public class CamelCasePatternMatching {
    static Trie root = new Trie();
    public static void makeTrie(String str){
        Trie temp = root;
        for(char x : str.toCharArray()){
            Trie node = new Trie();
            int ind = x-'0'-17;
            temp.arr[ind] = node;
            temp = temp.arr[ind];
        }
        temp.isComp = true;
    }
    public static boolean searchTrie(String str){
        Trie temp = root;
        for(char ch : str.toCharArray()){
            if(ch < 'A' || ch > 'Z'){
                continue;
            }
            int ind = ch-'0'-17;
            temp = temp.arr[ind];
            if(temp == null) break;
            if(temp.isComp) return true;
        }
        return false;
    }
    private static ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> ans = new ArrayList<>();
        makeTrie(Pattern);
        for(String str : Dictionary){
            if(searchTrie(str)){
                ans.add(str);
            }
        }
        if(ans.size() == 0){
            ans.add("-1");
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        String []dictionary = {"WelcomeGeek","WelcomeToGeeksForGeeks","GeeksForGeeks"};
        String pattern = "WTG";
        ArrayList<String> ans = new ArrayList<>();
        ans = CamelCase(n,dictionary,pattern);
        for(String  ele : ans){
            System.out.print(ele + " ");
        }
    }
}
