
public class FindTheClosestInBST {
    static class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

    private static int minDiff(Node root, int k){
        int minVal = Integer.MAX_VALUE;
        while(root != null){
            if(root.data < k){
                minVal = Math.min(minVal,Math.abs(k-root.data));
                root = root.right;
            } 
            else{
                minVal = Math.min(minVal,Math.abs(k-root.data));
                root = root.left;
            }
        }
        return minVal;
    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(11);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(6);
        root.left.right.left.right = new Node(4);
        int k = 13;

        System.out.println(minDiff(root,k));

    }
    
}
