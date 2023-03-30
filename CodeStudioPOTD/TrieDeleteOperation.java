import java.util.* ;
import java.io.*; 
class TrieNode {
    TrieNode children[] = new TrieNode[26];
    boolean isEnd;

    TrieNode() {
        isEnd = false;

        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
};
public class TrieDeleteOperation {

    public static TrieNode deleteWord(TrieNode root, String word) {
        // WRITE YOUR CODE HERE
        if(root == null) return null;
        if(word.length() == 0){
            root.isEnd = false;
            return root;
        }
        TrieNode cur = new TrieNode();
        int index = word.charAt(0)-'a';
        if(root.children[index] != null){
            cur = root.children[index];
        }
        else{
            return null;
        }
        return deleteWord(cur, word.substring(1));
    }
    public static void main(String[] args) {
        
    }

}