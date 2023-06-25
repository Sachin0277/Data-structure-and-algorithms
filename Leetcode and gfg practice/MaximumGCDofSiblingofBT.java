import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    node left,right;
    Node(int data){
        this.data = data;
    }
}
public class MaximumGCDofSiblingofBT {
    private static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    private static int maxGCD(node root){
        int max = 0;
        int outNode = 0; 
        if(root == null) return 0;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node cur = q.poll();
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
            if(cur.left != null && cur.right != null && max <= gcd(cur.left.data, cur.right.data)){
                max = gcd(cur.left.data,cur.right.data);
                outNode = cur.data;
            }
        }
        return outNode;
    }
    public static void main(String args[]){
        node root = new node(4);
        root.left = new node(5);
        root.right = new node(2);
        root.left.left = new node(3);
        root.left.right = new node(1);
        root.left.left.left = new node(6);
        root.left.left.right = new node(12);

        //calling function which will find the maximum gcd of siblings of the given binary tree
        int ans = maxGCD(root);
        System.out.println(ans);
    }
}
