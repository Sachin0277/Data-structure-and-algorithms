public class FindTheNodeFromEnd {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    /*
     * Method for finding the nt node from end
     */
    private static Node nthNodeFromEnd(Node head,int n){
        Node cur = head;
        Node ptr = head;
        int ctr = 0;
        while(ctr < n){
            if(cur == null) 
                return null;
            cur = cur.next;
            ctr++;
        }
        while(cur != null){
            ptr = ptr.next;
            cur = cur.next;
        }
        return ptr;
    }
    public static void main(String args[]){
        FindTheNodeFromEnd LinkedListNode = new FindTheNodeFromEnd();
        LinkedListNode.head = new Node(1);
        LinkedListNode.head.next = new Node(2);
        LinkedListNode.head.next.next = new Node(3);
        LinkedListNode.head.next.next.next = new Node(4);
        LinkedListNode.head.next.next.next.next = new Node(5);
        int n = 1;
        //calling the method which will find the 
        Node node = nthNodeFromEnd(head,n);
        if(node == null) System.out.println("-1");
        System.out.println("The Nth node from end is "+node.data);
    }
    
}
