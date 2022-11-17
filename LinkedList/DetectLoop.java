public class DetectLoop {
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
     * Method for detecting linked list using floyd's cycle detection algorithm
     */
    private static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
            DetectLoop LinkedListObj = new DetectLoop();
            LinkedListObj.head = new Node(1);
            LinkedListObj.head.next = new Node(2);
            LinkedListObj.head.next.next = new Node(3);
            LinkedListObj.head.next.next.next = new Node(4);
            LinkedListObj.head.next.next.next.next = LinkedListObj.head;
            //LinkedListObj.head.next.next.next.next.next = new Node(5);

            /*
             * Calling method which will detect whether there is loop or not in the given linked list
             */
            if(detectLoop(head)){
                System.out.println("There is loop in the given linked list.");
            }
            else {
                System.out.println("There is no loop in the given linked list.");
            }
    }
}
