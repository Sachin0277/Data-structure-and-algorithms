class Node{
    int data;
    node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RearrangeLinkedList {
    private static node reverseList(node head){
        node cur = head,prev = null;
        while(cur != null){
            node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    private static node rearrangeList(node head){
        if(head == null) return null;
        node fast = head.next,slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node node1 = head;
        node node2 = slow.next;
        slow.next = null;

        node2 = reverseList(node2);

        node node = new node(0);
        node cur = node;
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

    private static void printList(node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]){
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);


        node ans = rearrangeList(head);
        printList(ans);
    }
}
