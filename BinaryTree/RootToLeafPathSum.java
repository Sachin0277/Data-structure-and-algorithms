import java.util.Stack;

class TreeNode5 {
    int data;
    treenode left,right;
    TreeNode5(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class RootToLeafPathSum {
    /*
     * Method to find root to leaf path sum equal to given number 
     */
    private static boolean rootToLeafPathSum(treenode root, int k){
        Stack<treenode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty() && root != null){
            treenode temp = st.pop();
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
            treenode root = new treenode(10);
            root.left = new treenode(8);
            root.right = new treenode(2);
            root.left.left = new treenode(3);
            root.left.right = new treenode(4);
            root.right.left = new treenode(2);
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
