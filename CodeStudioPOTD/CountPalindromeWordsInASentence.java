public class CountPalindromeWordsInASentence {
    //function to check whether the given word is palindrome or not 
    private static boolean isPalindrome(String s){
        if(s.length() == 1) return true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    //Utility function
    private static int countPalindromeWord(String s){

        //edge cases like when string is empty
        if(s.length() == 0) return 0;
        //keep in mind that string contains both uppercase and lowercase letter along with one or more spaces
        //so first of all convert the string to either lowercase or uppercase
        s = s.toLowerCase(); //--> inbuilt function
        
        // String s="";
        // for(int i=0;i<s.length();i++){
        //     if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
        //         s+= (s.charAt(i)+32);
        //     }
        // }
        String temp ="";
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                temp+=s.charAt(i);
            }
            else if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                if(isPalindrome(temp)){
                    cnt++;
                }
                //this is vital and crucial step : clear the temp so that next time it store the next word otherwise it will be concatenated with the previous word
                temp="";
            }
        }
        if(isPalindrome(temp)) cnt++;
        return cnt;
    }
    public static void main(String args[]){
        //constraint : there can be one or more spaces
        //string may contain both uppercase and lowercase letters
        String c1 = "Madam is a very perfect mom";
        String c2 = "NiTin is a good boy";

        //lets make a function which will take string as argument and return the count of palindromic words present in the sentence
        int ans1 = countPalindromeWord(c1);
        int ans2 = countPalindromeWord(c2);
        System.out.println(ans1);
        System.out.println(ans2);

    }
}
