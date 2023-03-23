class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left  = right = null;
    }
}
public class BSTMaximumDifference {
    private static int maxDifferenceBST(Node root, int target){
        Node targetNode = null; 
        long targetSum = 0;
        while(root != null){
            if(root.data == target){
                targetNode = root;
                break;
            }
            targetSum+= root.data;
            if(root.data < target) root = root.right;
            else root = root.left;
        }
        if(targetNode  == null) return -1;
        long lsum = childSum(root.left);
        long rsum = childSum(root.right);
        if(lsum == 0) return (int)(targetSum-rsum);
        if(rsum == 0) return (int)(targetSum -lsum);
        return (int)Math.max(targetSum-lsum,targetSum-rsum);
    }

    private static long childSum(Node root){
        if(root==null) return 0;
        long lsum = childSum(root.left);
        long rsum = childSum(root.right);
        if(lsum == 0) return (int)(root.data-rsum);
        if(rsum == 0) return (int)(root.data -lsum);
        return root.data+(int)Math.min(lsum,rsum);

    }
    public static void main(String[] args) {
        Node root = new Node(25);
        root.left = new Node(20);
        root.right = new Node(35);
        root.left.left = new Node(15);
        root.left.right = new Node(22);
        root.right.left = new Node(30);
        root.right.right = new Node(45);
        root.right.left.right = new Node(32);
        int target = 20;
        int ans = maxDifferenceBST(root,target);
        System.out.println(ans);
    }
}
