//package BinaryTree; 
class node {
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        left = null;
        right = null;
    }

}
public class MaximumSumInLongestPath {
    public static int maxSum ;
    public static int maxLen ;
    public static void sumOfLongestPath(node root, int sum, int len){
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
    public static int sumOfLongestPath(node root){
        if(root == null) return 0;
        maxSum = Integer.MIN_VALUE;
        maxLen = 0;
        sumOfLongestPath(root,0,0);
        return maxSum;
    }
    public static void main(String[] args) {
        node node = new node(5);
        node.left = new node(6);
        node.right = new node(7);
        node.right.left = new node(8);
        node.right.right = new node(10);
        node.right.left.right = new node(9);

        int maxSum = sumOfLongestPath(node);
        System.out.println("The maximum sum of elements in longest path is: "+maxSum);

    }
}
