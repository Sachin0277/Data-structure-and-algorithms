class Node{
    int data;
    node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectTheCycle {

    private static boolean detectCycle(node head){
        //using slow and fast pointer concept 
        node slow=head, fast = head;
        while(fast!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]){
        node head = new node(3);
        head.next = new node(2);
        head.next.next = new node(0);
        head.next.next.next = new node(-4);
        head.next.next.next = head.next;

        System.out.println(detectCycle(head));
    }
    
}
