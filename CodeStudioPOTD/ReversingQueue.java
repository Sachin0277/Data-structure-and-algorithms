import java.util.LinkedList;
import java.util.Queue;

public class ReversingQueue {
    private static void reverse(Queue<Integer> q){
        // base condition
        if(q.size()==0) return;
        int front = q.peek();
        q.poll();
        reverse(q);
        q.add(front);
      }
      
      public static Queue<Integer> reverseQueue(Queue<Integer> q) {
    
        // Write your code here.
  
        reverse(q);
        return q;
        
        
      }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(6);
        q.add(8);
        q.add(12);
        q.add(3);
        Queue<Integer> ans = reverseQueue(q);
        while(!ans.isEmpty()){
            System.out.print(ans.poll()+" ");
        }
    }
}
