

import java.util.*;

public class StringCompression {
    private static String compress(String str){
        char s[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int c = 1;
        char temp = str.charAt(0);
        int length = str.length();
        for(int i=0;i<length-1;i++){
            temp = s[i];
            if(temp == s[i+1]){
                c++;
            }
            else{
                sb.append(temp + "" + c);
                c = 1;
            }
        }
        sb.append(temp +""+c);
        return sb.toString();
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String origString = sc.nextLine();
        
        //call the function
        String compressedStr = compress(origString);
        if(compressedStr.length() < origString.length()){
            System.out.println(compressedStr);
        }
        else{
            System.out.println(origString);
        }
        
        
    }

}
