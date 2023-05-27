class Node{
    int data;
    Node next;
    Node(){
        this.next = null;
    }
    Node (int data){
        this.data = data;
        this.next = null;
    }

}
public class ModifyLinkedList {
    private static Node reverse(Node head){
        if(head == null && head.next == null) return head;
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    private static Node modifyLinkedList(Node head){
        // to find the middle 
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = slow.next;
        slow.next = null;
        
        
        Node newHead = reverse(temp);
        Node cur = head;
        Node cur1 = newHead;
        while(cur!= null && cur1 != null){
            cur1.data = cur1.data - cur.data;
            cur = cur.next;
            cur1 = cur1.next;
            
            
        }
        newHead = reverse(newHead);
        slow.next = newHead;
        return reverse(head);
    }
    private static void printList(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
            if(head != null){
                System.out.print(" -> ");
            }
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        Node ansNode = modifyLinkedList(head);
        printList(ansNode);
    }
}
