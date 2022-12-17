import java.util.Stack;
import java.util.Scanner;


public class ReversePolishNotation {
    private static int evalRPN(String[] tokens){
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();

        for(String t:tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch(t){
                    case "+":
                        stack.push(String.valueOf(b+a));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(b*a));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;

                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
    public static void main(String args[]){
        // String[] tokens = {"2","1","+","3","*"};
        // System.out.println(evalRPN(tokens));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String[] tokens = new String[n];
        System.out.println("Enter the reverse polish notation:");
        for(int i=0;i<n;i++){
            tokens[i] = sc.next();
        }
        int ans = evalRPN(tokens);
        System.out.println("The value after evalutation is : " + ans);
    }
}
