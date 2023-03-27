import java.util.Stack;
public class InsertElementAtBottoomOfStack{


    private static Stack<Integer> pushAtBottom(Stack<Integer> myStack,int x){
        Stack<Integer> newStack = new Stack<>();
        while(!newStack.isEmpty()){
            newStack.push(myStack.pop());
        }
        myStack.push(x);
        while(!newStack.isEmpty()){
            myStack.push(newStack.pop());
        }
        return myStack;
    }


    private static void printStack(Stack<Integer> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(7);
        myStack.push(1);
        myStack.push(4);
        myStack.push(5);
        int x = 9;
        Stack<Integer> ans = pushAtBottom(myStack,x);
        printStack(ans);
    }
}