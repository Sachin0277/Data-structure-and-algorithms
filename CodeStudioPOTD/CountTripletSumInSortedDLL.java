import java.util.HashMap;
class Node5 {
    int data;
    node prev;
    node next;
    Node5(int data){
        this.data = data;
        prev = next = null;
    }
}
public class CountTripletSumInSortedDLL {

    public static int countTriplets(node head, int x){
        // Write your code here
        int count = 0;
        HashMap<Integer, node> map = new HashMap<>();
        node p=head,p1,p2;
        while(p != null){
            map.put(p.data,p);
            p = p.next;
        }
        for(p1=head;p1!=null;p1 = p1.next){
            for(p2= p1.next;p2 != null ; p2 = p2.next){
                int twoSum = p1.data+p2.data;
                if(map.containsKey(x-twoSum) && map.get(x-twoSum) != p2 && map.get(x-twoSum) != p1){
                    count++;
                }
            }
        }
        return count/3;
    }

    private static node insert(node head, int val){
        node temp = new node(val);
        if(head == null)
            head = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        Node5 head = null;
             
            // insert values in sorted order
            head = insert(head, 9);
            head = insert(head, 8);
            head = insert(head, 6);
            head = insert(head, 5);
            head = insert(head, 4);
            head = insert(head, 2);
            head = insert(head, 1);
 
            int x = 17;
            System.out.println("count = " + countTriplets(head, x));
 
    }
    
}
