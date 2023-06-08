package GEHealthcare;

class nextLLNode {
    int data;
    nextLLNode next;
 
    public nextLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}
 
public class ReverseLinkedListByMid {
    public static nextLLNode reverseInitials(nextLLNode head) {
        if (head == null || head.next == null)
            return head;
 
        // Find the middle nextLLNode
        nextLLNode slow = head;
        nextLLNode fast = head;
        nextLLNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
 
        // Reverse the second half of the list
        nextLLNode secondHalf = slow;
        prev.next = null;
        nextLLNode curr = secondHalf;
        nextLLNode prevnextLLNode = null;
        nextLLNode nextnextLLNode = null;
        while (curr != null) {
            nextnextLLNode = curr.next;
            curr.next = prevnextLLNode;
            prevnextLLNode = curr;
            curr = nextnextLLNode;
        }
        secondHalf = prevnextLLNode;
 
        // Merge the first and second halves
        nextLLNode firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            nextLLNode firstNext = firstHalf.next;
            nextLLNode secondNext = secondHalf.next;
 
            firstHalf.next = secondHalf;
            secondHalf.next = firstNext;
 
            firstHalf = firstNext;
            secondHalf = secondNext;
        }
 
        return head;
    }
 
    public static void printList(nextLLNode head) {
        nextLLNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        nextLLNode head = new nextLLNode(14);
        head.next = new nextLLNode(21);
        head.next.next = new nextLLNode(28);
        head.next.next.next = new nextLLNode(35);
        head.next.next.next.next = new nextLLNode(42);
        head.next.next.next.next.next = new nextLLNode(56);
        head.next.next.next.next.next.next = new nextLLNode(63);
 
        System.out.print("Input: ");
        printList(head);
 
        head = reverseInitials(head);
 
        System.out.print("Output: ");
        printList(head);
    }
}
