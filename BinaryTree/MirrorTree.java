//package BinaryTree;

import java.util.*;
class Node1 {
    char data;
    node left,right;
    Node1(char data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class MirrorTree {

    private static void mirror(node root){
        if(root == null) return;
        Queue<node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            node cur = q.poll();
            node temp = cur.left;
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
    private static void inorder(node root){
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
        node root = new node('A');
        root.left = new node('B');
        root.right = new node('C');
        root.left.left = new node('D');
        root.left.right = new node('E');
        System.out.println("The original tree is:");
        inorder(root);
        mirror(root);
        System.out.println("\nThe mirror tree of the given is binary tree: " );
        inorder(root);
        
    }
}
