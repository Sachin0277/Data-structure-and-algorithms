import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class RootToLeafPathSum {
    /*
     * Method to find root to leaf path sum equal to given number 
     */
    private static boolean rootToLeafPathSum(TreeNode root,int k){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty() && root != null){
            TreeNode temp = st.pop();
            if(temp.left == null && temp.right == null){
                if(temp.data == k){
                    return true;
                }
            }
            if(temp.left != null){
                temp.left.data += temp.data;
                st.push(temp.left);
            }
            if(temp.right != null){
                temp.right.data += temp.data;
                st.push(temp.right);
            }
            
        }
        return false;
    }
    public static void main(String[] args){
           /*
            * Creating a binary tree by initialising using constructor
            */
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(8);
            root.right = new TreeNode(2);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(4);
            root.right.left = new TreeNode(2);
            int num = 23;
            boolean sum = rootToLeafPathSum(root,num);
            if(sum == true){
                System.out.println("There is path from root to leaf with sum "+ num);
            }
            else{
                System.out.println("There is no path from root to leaf");
            }
    }
}
