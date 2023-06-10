import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class ReverseFirstKElementOfQueue{

    private static void print(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
    }

    //The Naive Approach using stack 
    private static Queue<Integer> reverseElementNaive(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        while(k-- > 0){
            st.push(q.poll());
        } 
        Queue<Integer> ans = new LinkedList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;

    }
    //Recursive function to reverse k elements in the queue
    
    private static void solve(Queue<Integer> q , int k){
        // base condition 
       if(k == 0) return;
       
       int e = q.peek();
       q.remove();
       solve(q, k - 1);
       q.add(e);
    }

    //The Efficient Approach only using the standard queue methods 
    private static Queue<Integer> reverseElementEfficient(Queue<Integer> q, int k){
        //Using recursion 
       solve(q, k);
       int s = q.size() - k;
       while( s-- > 0){
           int x = q.poll();
           q.add(x);
       }
       return q;
        
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3; // output should be : [3,2,1,4,5];

        Queue<Integer> ansQueue = reverseElementNaive(q,k);
        Queue<Integer> resQueue = reverseElementEfficient(q,k);
        print(ansQueue);
        System.out.println();
        print(resQueue);
    }
}