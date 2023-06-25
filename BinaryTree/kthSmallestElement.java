import java.util.Stack;

class BSTNode{
    int data;
    BSTNode1 left,right;
    BSTNode (int data){
        this.data = data;
        left = right = null;
    }
}
public class kthSmallestElement {
    /*
     * Method which finds the kth smallest element in the bst and return it to main function
     */
    private static int kthSmallestElement(BSTNode1 root, int k){
        Stack<BSTNode1> st = new Stack<>();
        while(root != null){
            st.push(root);
            root = root.left;
        }
        while(k-- != 0){
            BSTNode1 cur = st.pop();
            if(k == 0) return cur.data;
            BSTNode1 rt = cur.right;
            while(rt!=null){
                st.push(rt);
                rt = rt.left;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        BSTNode1 root = new BSTNode1(10);
        root.left = new BSTNode1(5);
        root.right = new BSTNode1(12);
        root.left.left = new BSTNode1(2);
        root.left.right = new BSTNode1(6);
        root.left.left.left = new BSTNode1(1);
        root.left.left.right = new BSTNode1(3);
        root.right.left = new BSTNode1(11);
        root.right.right = new BSTNode1(13);
        int k = 4;
        /*
         * Calling method which will determine the kth smallest element in BST
         */
         
         int smallestEle = kthSmallestElement(root,k);
         System.out.println("The kth smalles element in BST :" + smallestEle);
    }
}
