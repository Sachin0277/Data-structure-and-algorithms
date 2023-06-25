class Node{
    int data;
    node left;
    node right;
    Node(int data){
        this.data = data;
        left  = right = null;
    }
}
public class BSTMaximumDifference {
    private static int maxDifferenceBST(node root, int target){
        node targetNode = null;
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

    private static long childSum(node root){
        if(root==null) return 0;
        long lsum = childSum(root.left);
        long rsum = childSum(root.right);
        if(lsum == 0) return (int)(root.data-rsum);
        if(rsum == 0) return (int)(root.data -lsum);
        return root.data+(int)Math.min(lsum,rsum);

    }
    public static void main(String[] args) {
        node root = new node(25);
        root.left = new node(20);
        root.right = new node(35);
        root.left.left = new node(15);
        root.left.right = new node(22);
        root.right.left = new node(30);
        root.right.right = new node(45);
        root.right.left.right = new node(32);
        int target = 20;
        int ans = maxDifferenceBST(root,target);
        System.out.println(ans);
    }
}
