import java.util.LinkedList;
import java.util.Queue;

/*
 * Write a program to find number of leaves in binary tree without recursion
 */
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class NoOfLeavesInBT {
    private static int countNumOfLeaves(Node root){
        int leaves = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.left == null && cur.right == null){
                leaves++;
            }
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
        }
        return leaves;
    }
   public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        //calling method to find the number of leaves in binary tree 
       
        int numofleaves = countNumOfLeaves(root);
        System.out.println("\n The total numbe of leaves in binary tree is "+ numofleaves);

    
   }
}
