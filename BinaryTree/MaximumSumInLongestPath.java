//package BinaryTree; 
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

}
public class MaximumSumInLongestPath {
    public static int maxSum ;
    public static int maxLen ;
    public static void sumOfLongestPath(Node root,int sum,int len){
        if(root == null){
            if(maxLen < len){
                maxLen = len;
                maxSum = sum;
            }
            else if(maxLen == len && maxSum < sum){
                maxSum = sum;
            }
            return;
        }
        sumOfLongestPath(root.left,sum+root.data,len+1);
        sumOfLongestPath(root.right,sum+root.data,len+1);
    }
    public static int sumOfLongestPath(Node root){
        if(root == null) return 0;
        maxSum = Integer.MIN_VALUE;
        maxLen = 0;
        sumOfLongestPath(root,0,0);
        return maxSum;
    }
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(6);
        node.right = new Node(7);
        node.right.left = new Node(8);
        node.right.right = new Node(10);
        node.right.left.right = new Node(9);

        int maxSum = sumOfLongestPath(node);
        System.out.println("The maximum sum of elements in longest path is: "+maxSum);

    }
}
