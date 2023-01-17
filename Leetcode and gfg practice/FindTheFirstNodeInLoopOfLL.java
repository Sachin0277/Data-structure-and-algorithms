
public class FindTheFirstNodeInLoopOfLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private static Node loop(Node head){
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }

    private static int findFirstNode(Node head){
        Node ptr = head;
        Node firstNode = loop(head);
        if(firstNode == null) return -1;
        else{
            while(ptr != firstNode){
                firstNode = firstNode.next;
                ptr = ptr.next;
            }
            return ptr.data;
        }

    }
    public static void main(String args[]){
        FindTheFirstNodeInLoopOfLL node = new FindTheFirstNodeInLoopOfLL();
        node.head = new Node(1);
        node.head.next = new Node(3);
        node.head.next.next = new Node(2);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = node.head.next;
        int ans = findFirstNode(head);
        System.out.println(ans);

    }
}
