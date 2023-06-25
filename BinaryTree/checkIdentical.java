 class TreeNode{
    int data;
    treenode left,right;
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
 }
public class checkIdentical {
     /*
      * Method for checking whether the given two trees are structurally identical are not 
      */

    private static boolean isIdentical(treenode root1 , treenode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 != null && root2 != null){
            return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        }
        return false;
    }
    public static void main(String args[]){
        treenode root1 = new treenode(1);
        root1.left = new treenode(2);
        root1.right = new treenode(3);
        root1.left.left = new treenode(4);
        root1.left.right = new treenode(5);
        root1.right.left = new treenode(6);
        root1.right.right = new treenode(7);

        treenode root2 = new treenode(1);
        root2.left = new treenode(2);
        root2.right = new treenode(3);
        root2.left.left = new treenode(4);
        root2.left.right = new treenode(5);
        root2.right.left = new treenode(6);
        root2.right.right = new treenode(7);

        /*
         * calling isIdentical function
         */
        if(isIdentical(root1,root2)){
            System.out.println("Identical ");
        }
        else{
            System.out.println("Not identical");
        }

    }
}
