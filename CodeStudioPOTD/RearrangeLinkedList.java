class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RearrangeLinkedList {
    private static Node reverseList(Node head){
        Node cur = head,prev = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    private static Node rearrangeList(Node head){
        if(head == null) return null;
        Node fast = head.next,slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node node1 = head;
        Node node2 = slow.next;
        slow.next = null;

        node2 = reverseList(node2);

        Node node = new Node(0);
        Node cur = node;
        while(node1 != null || node2 != null){
            if(node1 != null){
                cur.next = node1;
                cur = cur.next;
                node1 = node1.next;
            }
            if(node2 != null){
                cur.next = node2;
                cur = cur.next;
                node2 = node2.next;
            }
        }
        cur = node.next;
        return cur;

    }

    private static void printList(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        Node ans = rearrangeList(head);
        printList(ans);
    }
}
