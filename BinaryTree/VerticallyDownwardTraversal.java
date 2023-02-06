import java.util.Queue;
import java.util.LinkedList;
class Pair{
    Node node;
    int colm;
    Pair(Node node,int colm){
        this.node = node;
        this.colm = colm;
    }
}
class Node{
    int data ;
    Node left , right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class VerticallyDownwardTraversal {
    private static long verticallyDownBST(Node root,int target)
    {
        long res = 0;
        while(root != null){
            if(root.data == target) 
                break;
            if(root.data < target ) root = root.right;
            else root = root.left;
        }
        if(root == null) return -1;
        
        Queue<Pair> q = new LinkedList<>();
        if(root.left != null) q.add(new Pair(root.left,-1));
        if(root.right != null) q.add(new Pair(root.right,+1));
        
        while(!q.isEmpty()){
            Pair pair = q.remove();
            Node cur = pair.node;
            if(pair.colm == 0){
                res += cur.data;
            }
            if(cur.left != null) q.add(new Pair(cur.left,pair.colm-1));
            if(cur.right != null) q.add(new Pair(cur.right,pair.colm+1));
        }
        return res;

    }
    public static void main(String args[]){
        Node root = new Node(25);
        root.left = new Node(20);
        root.right = new Node(35);
        root.left.left = new Node(15);
        root.left.right = new Node(22);
        root.right.left = new Node(30);
        root.right.right = new Node(45);
        root.right.left.right = new Node(32); 

        int target = 35;

        //calling function
        long ans = verticallyDownBST(root, target);
        System.out.println(ans);
        int tar = 25;

        //calling function
        long res = verticallyDownBST(root, tar);
        System.out.println(res);

    }
}
