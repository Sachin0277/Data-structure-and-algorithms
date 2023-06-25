class treenode {
    int data;
    treenode left,right;
    treenode(int data){
        this.data = data;
        left = right = null;
    }
}
public class LowestCommonAncestor {

    //lowest ancestor method 
    private static treenode lca(treenode root, int x, int y){
        if(root == null || x == root.data || y == root.data) return root;
        treenode leftSub = lca(root.left,x,y);
        treenode rightSub = lca(root.right,x,y);
        if(leftSub == null) return rightSub;
        else if(rightSub == null) return leftSub;
        else return root;

    }
    //Creating a tree to test 
   public static void main(String[] args){
    treenode root = new treenode(1);
    root.left = new treenode(2);
    root.right = new treenode(3);
    root.left.left = new treenode(4);
    root.left.right = new treenode(5);
    root.right.left = new treenode(6);
    root.right.right = new treenode(7);

    //calling lca function which will find the lowest common ancestor between given nodes
    int x=4;
    int y=7 ;
    treenode lowestCommonAncestorNode = lca(root,x,y);
    System.out.println("The lowest common ancestor of "+x +" and "+ y+" is: " + lowestCommonAncestorNode.data);
   }

}
