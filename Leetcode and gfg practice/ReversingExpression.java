import java.util.*;
public class ReversingExpression {

    private static String reverseTheEquation(String S){
        int n = S.length();
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i < n){
            String s = "";
            while(i < n && S.charAt(i) >= '0' && S.charAt(i) <= '9'){
                s += S.charAt(i);
                i++;
            }
            st.push(s);
            if(i < n) {
                st.push(S.charAt(i)+"");
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    public static void main(String args[]){
        String S = "5+2*56-2/4";
        System.out.println(reverseTheEquation(S));
    }
}
