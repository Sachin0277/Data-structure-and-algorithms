/*
 * Problem Description:
 * Given a state diagram in the form of a linked list, where each node represents a unique character and has two pointers ('next' and 'random'),
 *  and a string 'str', find if this string is acceptable by the state diagram or not. The state diagram looks something like this:

 *A string is said to be acceptable if and only if it matches the flow of states character by character and ends at final state i.e. state with
 *next equal to 'null'. For the below diagram 'c' is the final state.
 */

class Node{
    Character data;
    Node next;
    Node random;
    Node(Character data){
        this.data = data;
        this.next = null;
        this.random = null;
    }
}
public class StateDiagram {

    private static boolean isItAccepted(Node root,String str){
        Node temp = new Node('0');
        temp.next = root;
        int n = str.length();
        int i=0;
        while(i < n){
            if(temp.next != null && temp.next.data == str.charAt(i)){
                temp = temp.next;
                i++;
            }
            else if(temp.random != null && temp.random.data == str.charAt(i)){
                temp = temp.random;
                i++;
            }
            else{
                return false;
            }
            if(i == n){
                if(temp.next == null) return true;
                else return false;
            }
        }
        return true;

    }

    public static void main(String args[]){
        //creating the fintie state machine using linked list data structure
        Node root = new Node('a');
        root.next = new Node('b');
        root.random = new Node('c');
        root.next.next = root.random;
        root.next.random = root.next;
        root.random.random = root.random;
        root.random.next = null;

        String str = "abc";
        //calling the function which will check whether the string will be accepted by the given finite state machine or not 
        boolean ans = isItAccepted(root,str);
        System.out.println(ans);
        

    }
}
