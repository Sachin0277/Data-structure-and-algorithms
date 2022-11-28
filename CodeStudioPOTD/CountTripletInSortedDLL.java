import java.util.*;

public class CountTripletInSortedDLL{
    static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }
    static Node insert(Node head,int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }
    public static int countTriplet(Node head,int x){
        
        int counter = 0;
        Node p,p1,p2;
        HashMap<Integer,Node> hm = new HashMap<>();
        for(p = head; p != null; p = p.next){
            hm.put(p.data,p);
        }
        for(p1 = head ; p1 != null ; p1 = p1.next){
            for(p2 = p1.next; p2 != null ; p2 = p2.next){
                int sum = p1.data+ p2.data;
                if(hm.containsKey(x - sum) && hm.get(x - sum ) != p1 && hm.get(x - sum) != p2){
                    counter++;
                }
            }
        }
        return counter/3;

    }
    public static void main(String args[]){
        Node root = null;
        root = insert(root, 1);
        root = insert(root,2);
        root = insert(root,3);
        root = insert(root,8);
        root = insert(root,9);
        int x = 13;
        //count triplet function call
        int n = countTriplet(root,x);
        System.out.println("Triplet count : "+n);
    }
}