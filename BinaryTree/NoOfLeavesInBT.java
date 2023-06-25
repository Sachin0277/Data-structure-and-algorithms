import java.util.LinkedList;
import java.util.Queue;

/*
 * Write a program to find number of leaves in binary tree without recursion
 */
class Node2 {
    int data;
    node left,right;
    Node2(int data){
        this.data = data;
        left = right = null;
    }
}
public class NoOfLeavesInBT {
    private static int countNumOfLeaves(node root){
        int leaves = 0;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node cur = q.poll();
            if(cur.left == null && cur.right == null){
                leaves++;
            }
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
        }
        return leaves;
    }
   public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);

        //calling method to find the number of leaves in binary tree 
       
        int numofleaves = countNumOfLeaves(root);
        System.out.println("\n The total numbe of leaves in binary tree is "+ numofleaves);

    
   }
}
