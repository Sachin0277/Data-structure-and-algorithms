import java.util.TreeSet;


public class UnionOfTwoLinkedLists {
    static class llnode {
    int data;
    llnode next;

    llnode(int d) {
        this.data = d;
        this.next = null;
    }
}


    private static llnode findUnion(llnode head1,llnode head2){
        TreeSet<Integer> set = new TreeSet<>();
        while(head1 != null){
            set.add(head1.data);
            head1 = head1.next;
        }
        while(head2 != null){
            set.add(head2.data);
            head2 = head2.next;
        }
        llnode head = new llnode(0);
        llnode dummy = head;
        for(int setElement : set){
            llnode newNode = new llnode(setElement);
            dummy.next = newNode;
            dummy = newNode;
        }
        return head.next;
    }

    private static void print(llnode node){
        while(node.next != null){
            System.out.print(node.data + " ->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        llnode head1 = new llnode(9);
        head1.next = new llnode(6);
        head1.next.next = new llnode(4);
        head1.next.next.next = new llnode(2);
        head1.next.next.next.next = new llnode(3);
        head1.next.next.next.next.next = new llnode(8);
       
        llnode head2 = new llnode(4);
        head2.next = new llnode(5);
        head2.next.next = new llnode(6);
        head2.next.next.next = new llnode(7);
        head2.next.next.next.next = new llnode(1);

        llnode ans = findUnion(head1,head2);
        print(ans);

    }
}
