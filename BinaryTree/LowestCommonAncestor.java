class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class LowestCommonAncestor {

    //lowest ancestor method 
    private static TreeNode lca(TreeNode root,int x,int y){
        if(root == null || x == root.data || y == root.data) return root;
        TreeNode leftSub = lca(root.left,x,y);
        TreeNode rightSub = lca(root.right,x,y);
        if(leftSub == null) return rightSub;
        else if(rightSub == null) return leftSub;
        else return root;

    }
    //Creating a tree to test 
   public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    //calling lca function which will find the lowest common ancestor between given nodes
    int x=4;
    int y=7 ;
    TreeNode lowestCommonAncestorNode = lca(root,x,y);
    System.out.println("The lowest common ancestor of "+x +" and "+ y+" is: " + lowestCommonAncestorNode.data);
   }

}
