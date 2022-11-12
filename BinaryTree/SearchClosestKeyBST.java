class BSTNode{
    int val;
    BSTNode left,right;
    BSTNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class SearchClosestKeyBST {
    private static BSTNode findClosestNode(BSTNode node, int target) {
        if (target < node.val && node.left != null) {
          // Closest node is either the current node or a node in the left subtree
          BSTNode closestNodeLeftSubtree = findClosestNode(node.left, target);
          return getClosestNode(node, closestNodeLeftSubtree, target);
        } else if (target > node.val && node.right != null){
          // Closest node is either the current node or a node in the right subtree
          BSTNode closestNodeRightSubtree = findClosestNode(node.right, target);
          return getClosestNode(node, closestNodeRightSubtree, target);
        } else {
          return node;
        }
      }
    
      private static BSTNode getClosestNode(BSTNode node1, BSTNode node2, int target) {
        if(Math.abs(target - node1.val) < Math.abs(target - node2.val)) {
          return node1;
        } else {
          return node2;
        }
      }
    public static void main(String args[]){
        BSTNode node = new BSTNode(9);
        node.left = new BSTNode(4);
        node.right = new BSTNode(17);
    
        node.left.left = new BSTNode(3);
        node.left.right = new BSTNode(6);
        node.left.right.left = new BSTNode(5);
        node.left.right.right = new BSTNode(7);
    
        node.right.right = new BSTNode(22);
        node.right.right.left = new BSTNode(20);
    
        BSTNode closestNode = findClosestNode(node, 18);
        System.out.println(closestNode.val);
            
    }
}
