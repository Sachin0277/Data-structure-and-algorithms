import java.util.Scanner;

import java.util.Stack;
public class DuplicateBrackets {
    // function which will return true if the expression have duplicate brackets otherwise false
    private static boolean duplicateBrackets(String exp){
        Stack<Character> st = new Stack<>();

        /*
         * Intuition : push into the stack till the character is not closing brace (')')
         * if closing brace then check if the peek element of stack is opening brace or not if it return true;
         * else pop the element till we get opening brace
         */

        for(int i=0;i<exp.length();i++){
             char c = exp.charAt(i);
             if(c == ')'){
                if(st.peek() == '('){
                    return true;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
             }
             else{
                st.push(c);
             }
        }
        return false;

    }
    public static void main(String args[]){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        //calling function to check whether an expression is having duplicate brackets or not
        System.out.println(duplicateBrackets(str));

    }
}
