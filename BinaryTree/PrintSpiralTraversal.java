//package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node3 {
    char data;
    node left;
    node right;
    Node3(char data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class PrintSpiralTraversal {
    private static ArrayList<ArrayList<Character>> spiralTraversal(node root){
            ArrayList<ArrayList<Character>> wrapList = new ArrayList<>();
            int level = 0;
            Queue<node> q= new LinkedList<>();
            boolean flag = true;
            q.add(root);
            while(!q.isEmpty()){
                int n = q.size();
                ArrayList<Character> subList = new ArrayList<>();
                for(int i=0;i<n;i++){
                    int ind = i;
                    if(q.peek().left != null)   q.offer(q.peek().left);
                    if(q.peek().right != null) q.offer(q.peek().right);
                    if(flag == true) subList.add(0,q.poll().data);
                    else subList.add(q.poll().data);
                   

                }
                flag = !flag;
                wrapList.add(subList);

            }
        return wrapList;
    }
    public static void main(String[] args) {
        node root = new node('A');
        root.left = new node('B');
        root.right = new node('C');
        root.left.left = new node('D');
        root.left.right = new node('E');
        root.right.left = new node('F');
        root.right.right = new node('G');
        ArrayList<ArrayList<Character>> res = new ArrayList<>();

        res = spiralTraversal(root);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                    System.out.print(res.get(i).get(j)+" ");
            }
           
        }
    }
}
