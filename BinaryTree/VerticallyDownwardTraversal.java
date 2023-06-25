import java.util.Queue;
import java.util.LinkedList;
class Pair{
    node node;
    int colm;
    Pair(node node, int colm){
        this.node = node;
        this.colm = colm;
    }
}
class Node4 {
    int data ;
    node left , right;
    Node4(int data){
        this.data = data;
        left = right = null;
    }
}


public class VerticallyDownwardTraversal {
    private static long verticallyDownBST(node root, int target)
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
            node cur = pair.node;
            if(pair.colm == 0){
                res += cur.data;
            }
            if(cur.left != null) q.add(new Pair(cur.left,pair.colm-1));
            if(cur.right != null) q.add(new Pair(cur.right,pair.colm+1));
        }
        return res;

    }
    public static void main(String args[]){
        node root = new node(25);
        root.left = new node(20);
        root.right = new node(35);
        root.left.left = new node(15);
        root.left.right = new node(22);
        root.right.left = new node(30);
        root.right.right = new node(45);
        root.right.left.right = new node(32);

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
