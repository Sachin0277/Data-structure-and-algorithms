import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    node left;
    node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class HeightOfBinaryTree {
    private static int heightOftree(node root){
        //using level order traversal or breadth first search (using queue data structure)
        int height = 0;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            height++;
            int n = q.size();
            for(int i=0;i<n;i++){
                node cur = q.poll();
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
            node root = new node(10);
            root.left = new node(5);
            root.right = new node(20);
            root.left.left = new node(2);
            root.left.right = new node(6);

            int height = heightOftree(root);
            System.out.println("The height of given binary tree is:"+height);
    }
}
