

public class ReverseLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //Method to reverse a linked list
    private static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        Node next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev ;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    //Method to print the linked list 
    private static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String args[]){

        ReverseLinkedList node = new ReverseLinkedList();
        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);

        //calling a function reverse a linked list
        Node reverseNode = reverse(head);
        printLinkedList(reverseNode);

    }
    //due to static it is very diffcult to do that 
}
