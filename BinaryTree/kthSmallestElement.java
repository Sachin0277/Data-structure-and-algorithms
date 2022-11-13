import java.util.Stack;

class BSTNode{
    int data;
    BSTNode left,right;
    BSTNode (int data){
        this.data = data;
        left = right = null;
    }
}
public class kthSmallestElement {
    /*
     * Method which finds the kth smallest element in the bst and return it to main function
     */
    private static int kthSmallestElement(BSTNode root,int k){
        Stack<BSTNode> st = new Stack<>();
        while(root != null){
            st.push(root);
            root = root.left;
        }
        while(k-- != 0){
            BSTNode cur = st.pop();
            if(k == 0) return cur.data;
            BSTNode rt = cur.right;
            while(rt!=null){
                st.push(rt);
                rt = rt.left;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.right = new BSTNode(12);
        root.left.left = new BSTNode(2);
        root.left.right = new BSTNode(6);
        root.left.left.left = new BSTNode(1);
        root.left.left.right = new BSTNode(3);
        root.right.left = new BSTNode(11);
        root.right.right = new BSTNode(13);
        int k = 4;
        /*
         * Calling method which will determine the kth smallest element in BST
         */
         
         int smallestEle = kthSmallestElement(root,k);
         System.out.println("The kth smalles element in BST :" + smallestEle);
    }
}
