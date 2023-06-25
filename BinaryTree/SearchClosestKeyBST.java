class BSTNode1 {
    int val;
    BSTNode1 left,right;
    BSTNode1(int val){
        this.val = val;
        left = right = null;
    }
}
public class SearchClosestKeyBST {
    private static BSTNode1 findClosestNode(BSTNode1 node, int target) {
        if (target < node.val && node.left != null) {
          // Closest node is either the current node or a node in the left subtree
          BSTNode1 closestNodeLeftSubtree = findClosestNode(node.left, target);
          return getClosestNode(node, closestNodeLeftSubtree, target);
        } else if (target > node.val && node.right != null){
          // Closest node is either the current node or a node in the right subtree
          BSTNode1 closestNodeRightSubtree = findClosestNode(node.right, target);
          return getClosestNode(node, closestNodeRightSubtree, target);
        } else {
          return node;
        }
      }
    
      private static BSTNode1 getClosestNode(BSTNode1 node1, BSTNode1 node2, int target) {
        if(Math.abs(target - node1.val) < Math.abs(target - node2.val)) {
          return node1;
        } else {
          return node2;
        }
      }
    public static void main(String args[]){
        BSTNode1 node = new BSTNode1(9);
        node.left = new BSTNode1(4);
        node.right = new BSTNode1(17);
    
        node.left.left = new BSTNode1(3);
        node.left.right = new BSTNode1(6);
        node.left.right.left = new BSTNode1(5);
        node.left.right.right = new BSTNode1(7);
    
        node.right.right = new BSTNode1(22);
        node.right.right.left = new BSTNode1(20);
    
        BSTNode1 closestNode = findClosestNode(node, 18);
        System.out.println(closestNode.val);
            
    }
}
