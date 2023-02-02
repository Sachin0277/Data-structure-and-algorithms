/*
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet 
 * is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words 
are sorted lexicographically in this alien language.

 
 */
public class VerifyingAnAlienDictionary {
    //creating map for each alphabets with its index
    private static int map[] = new int[26];

    //function that will check if the alien dictiionary is sorted or not 
    private static boolean isAlienSorted(String words[],String order){
        for(int i=0;i<order.length();i++){
            map[order.charAt(i)-'a'] = i;
        }
       //now lets compare each string with each other
       for(int i=1;i<words.length;i++){
            if(compareStr(words[i-1],words[i]))
                return false;
       } 
       return true;
    }

    //function that will compare each character of the two string and return true or false either it is sorted or not 
    private static boolean compareStr(String a,String b){
        int m = a.length();
        int n = b.length();
        for(int i=0;i < m && i < n;i++){
            if(a.charAt(i) != b.charAt(i)){
                return map[a.charAt(i)-'a'] > map[b.charAt(i)-'a'];
            }
        }
        return m > n;
    }
    public static void main(String args[]){
        //input parameters
        String order = "abcdefghijklmnopqrstuvwxyz";
        String words[] = {"apple","app"};

        //output 
        if(isAlienSorted(words,order)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }   
    }
}
