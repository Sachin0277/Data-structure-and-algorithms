import java.util.*;
class treeNode {
    int data;
    treenode left,right;
    treeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class LevelOrderTraversal {
    /*
     * Method for level order traversal --> using queue data structure --> Breadth first traversal
     */
    private static void levelOrderTraversal(treenode root){
        Queue<treenode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            treenode cur = q.poll();
            System.out.print(cur.data +" ");
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
        }

    }
    public static void main(String args[]){
        /*
         * Building tree
         */
            treenode root = new treenode(1);
            root.left = new treenode(2);
            root.right = new treenode(3);
            root.left.left = new treenode(4);
            root.left.right = new treenode(5);
            root.right.left = new treenode(6);
            root.right.right = new treenode(7);

            /*
             * calling level Order Traversal Method 
             */
            levelOrderTraversal(root);

    }
}
