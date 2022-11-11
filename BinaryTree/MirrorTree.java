//package BinaryTree;

import java.util.*;
class Node{
    char data;
    Node left,right;
    Node(char data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class MirrorTree {

    private static void mirror(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            Node temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if(cur.left != null){
                q.offer(cur.left);
            }
            if(cur.right != null){
                q.offer(cur.right);
            }

        }
    }
    private static void inorder(Node root){
        if(root == null) return;
        if(root.left != null)
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        System.out.println("The original tree is:");
        inorder(root);
        mirror(root);
        System.out.println("\nThe mirror tree of the given is binary tree: " );
        inorder(root);
        
    }
}
