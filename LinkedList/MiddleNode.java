public class MiddleNode {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //Method to find the middle node of the given linked list
    private static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    public static void main(String args[]){
        MiddleNode obj = new MiddleNode();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        

        //calling method which will find the midle node of the linked list
        Node mid = middleNode(head);
        System.out.println("The middle node of the given linked list is:"+mid.data);
    }
    
}
