class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectTheCycle {

    private static boolean detectCycle(Node head){
        //using slow and fast pointer concept 
        Node slow=head, fast = head;
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
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next = head.next;

        System.out.println(detectCycle(head));
    }
    
}
