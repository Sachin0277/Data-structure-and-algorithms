import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class HeightOfBinaryTree {
    private static int heightOftree(Node root){
        //using level order traversal or breadth first search (using queue data structure)
        int height = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            height++;
            int n = q.size();
            for(int i=0;i<n;i++){
                Node cur = q.poll();
                if(cur.left!= null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            
        }
        return height;
    }
    public static void main(String[] args){
            //building binary tree
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);
            root.left.left = new Node(2);
            root.left.right = new Node(6);

            int height = heightOftree(root);
            System.out.println("The height of given binary tree is:"+height);
    }
}
