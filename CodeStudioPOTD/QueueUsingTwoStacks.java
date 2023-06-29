
import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue{
    Stack<Integer> st1,st2;
    //constructor
    Queue (){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    public boolean enqueue(int x){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return true;
    }

    public int dequeue( ){
        return st1.pop();
    }
}

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.enqueue(1));
        System.out.println(q.enqueue(2));
        System.out.println(q.enqueue(3));
        System.out.println(q.dequeue());
    }
    
    
}
