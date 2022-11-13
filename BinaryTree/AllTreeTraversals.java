import java.util.Stack;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left,right;
    BinaryTreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class AllTreeTraversals {
    /*
     * Inorder Traversal (left -> root -> right) 
     */
    private static void inOrderRec(BinaryTreeNode root){
        if(root == null) return;
        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);
    }
    /*
     * Preorder Traversal (root -> left -> right )
     */
    private static void preOrderRec(BinaryTreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }
    /*
     * Postorder Traversal (left -> right -> root)
     */
    private static void postOrderRec(BinaryTreeNode root){
        if(root == null) return;
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.data + " ");
    }

    /*
     * inorder traversal using stack data structure (iterative approach);
     */
    private static void inorder(BinaryTreeNode root){
        Stack<BinaryTreeNode> st = new Stack<>();
        BinaryTreeNode cur = root;
        while(cur != null || !st.isEmpty()){
            if(cur != null){
                st.push(cur);
                cur = cur.left;
            }
            else{
            BinaryTreeNode temp = st.pop();
            System.out.print(temp.data +" ");
            cur = temp.right;
            }
        }
    }
     /*
     * preorder traversal using stack data structure (iterative approach);
     */
    private static void preorder(BinaryTreeNode root){
        Stack<BinaryTreeNode> st = new Stack<>();
        BinaryTreeNode cur = root;
        while(cur != null || !st.isEmpty()){
            if(cur != null){
                st.push(cur);
                System.out.print(cur.data +" ");
                cur = cur.left;
            }
            else{
                BinaryTreeNode temp = st.pop();
                cur = temp.right;
            }
        }
    }
      /*
     * postorder traversal using stack data structure (iterative approach);
     */
    
    private static void postorder(BinaryTreeNode root){
        Stack<BinaryTreeNode> st = new Stack<>();
        while(true){
            while(root != null){
                st.push(root);
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty()) return;
            root = st.pop();
            if(!st.isEmpty() && st.peek() == root) 
                root = root.right;
            else{
                System.out.print(root.data + " ");
                root = null;
            }
        }
        
    }
    public static void main(String args[]){
         BinaryTreeNode root = new BinaryTreeNode(1);
         root.left = new BinaryTreeNode(2);
         root.right = new BinaryTreeNode(3);
         root.left.left = new BinaryTreeNode(4);
         root.left.right = new BinaryTreeNode(5);
         root.right.left = new BinaryTreeNode(6);
         root.right.right = new BinaryTreeNode(7);

         /*
          * inorder,preorder,postorder tree traversal (Recursive approach)
          */
          System.out.println("Using recursive approach");
          System.out.println("Inorder Traversal: ");
          inOrderRec(root);
          System.out.println("\nPreorder Traversal: ");
          preOrderRec(root);
          System.out.println("\nPostorder Traversal :");
          postOrderRec(root);
          

          /*
           * inorder ,preorder,postorder tree traversal (Iterative approach)
           */
          System.out.println("\nUsing iterative approach");
          System.out.println("Inorder Traversal: ");
          inorder(root);
          System.out.println("\nPreorder Traversal: ");
          preorder(root);
          System.out.println("\nPostorder Traversal :");
          postorder(root);
    }
}
