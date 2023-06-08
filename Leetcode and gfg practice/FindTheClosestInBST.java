class BinaryTreeNode{
    int data;
    BinaryTreeNode left,right;
    //constructor
    BinaryTreeNode(int data){
        this.data = data;
        left = right = null;
    }
}

public class FindTheClosestInBST {

    public static int minDiff(BinaryTreeNode root, int k) {
        int minVal = Integer.MAX_VALUE;
        while (root != null) {
            if (root.data < k) {
                minVal = Math.min(minVal, Math.abs(k - root.data));
                root = root.right;
            } else {
                minVal = Math.min(minVal, Math.abs(k - root.data));
                root = root.left;
            }
        }
        return minVal;
    }

    public static void main(String args[]) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(11);
        root.left.left = new BinaryTreeNode(1);
        root.left.right = new BinaryTreeNode(5);
        root.left.right.left = new BinaryTreeNode(3);
        root.left.right.right = new BinaryTreeNode(6);
        root.left.right.left.right = new BinaryTreeNode(4);
        int k = 13;

        System.out.println(minDiff(root, k));

    }

}
