import java.util.*;
public class BasicCalculator {
    /*
     * Method for calculating the value of the given expression as string
     */
    private static int basicCalculator(String s){
        int res = 0;
        int sign = 1;
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(sign);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                num = num*10 +(c - '0');
            }
            else if(c == '+' || c == '-'){
                res += num*sign;
                sign = stack.peek()* c == '+' ? 1 : -1;
                num = 0;
            }
            else if(c == '('){
                stack.push(sign);
            }
            else if(c == ')'){
                stack.pop();
            }
        }
        res += sign*num;
        return res;

    }
    public static void main(String args[]){
        String str = "(1+(4+5+2)-3)+(6+8)";
        //function to find calculate the sum
        int result = basicCalculator(str);
        System.out.println("Answer: "+result);

    }
}
