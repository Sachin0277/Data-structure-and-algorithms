import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class LevelOrderTraversal {
    /*
     * Method for level order traversal --> using queue data structure --> Breadth first traversal
     */
    private static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            System.out.print(cur.data +" ");
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
        }

    }
    public static void main(String args[]){
        /*
         * Building tree
         */
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right.left = new TreeNode(6);
            root.right.right = new TreeNode(7);

            /*
             * calling level Order Traversal Method 
             */
            levelOrderTraversal(root);

    }
}
