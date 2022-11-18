import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left,right;
    BinaryTreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class CheckIfAllLevelsOfTwoTreesAreAnagramsOrNot {

    /*
     * function to check whether all level of two trees are anagrams or not
     */
    private static boolean areAnagrams(BinaryTreeNode node1, BinaryTreeNode node2){
        // if(node1 == null && node2 == null) 
        //     return true;
        // if(node1.data == node2.data)
        //     return (areAnagrams(node1.left, node2.right) && areAnagrams(node1.right, node2.left));
        // return false;
        Queue<BinaryTreeNode> q1=new LinkedList<>();

        Queue<BinaryTreeNode> q2=new LinkedList<>();

        

        Set<Integer> s1=new HashSet<>();

        Set<Integer> s2=new HashSet<>();

        

        q1.add(node1);

        q2.add(node2);

        

        s1.add(node1.data);

        s2.add(node2.data);

        while(!q1.isEmpty()&&!q2.isEmpty())

        {

            int n1=q1.size();

            int n2=q2.size();

            

            if(!s1.equals(s2))  

            return false;

            

         s1=new HashSet<>();

         s2=new HashSet<>();

         

         for(int i=0;i<n1;i++)

         {

             BinaryTreeNode t=q1.remove();

             if(t.left!=null)

             {

                 s1.add(t.left.data);

                 q1.add(t.left);

             }

             

             if(t.right!=null)

             {

                 s1.add(t.right.data);

                 q1.add(t.right);

             }

         }

           for(int i=0;i<n2;i++)

             {

                 BinaryTreeNode t=q2.remove();

                 if(t.left!=null)

                 {

                     s2.add(t.left.data);

                     q2.add(t.left);

                 }

                 

                 if(t.right!=null)

                 {

                     s2.add(t.right.data);

                     q2.add(t.right);

                 }

             }

        }

        return q1.isEmpty()&&q2.isEmpty();
    }

    public static void main(String args[]){
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1.left = new BinaryTreeNode(3);
        root1.left.left = null;
        root1.left.right = null;
        root1.right = new BinaryTreeNode(2);
        root1.right.left = new BinaryTreeNode(5);
        root1.right.right = new BinaryTreeNode(4);

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2.left = new BinaryTreeNode(2);
        root2.right = new BinaryTreeNode(3);
        root2.left.left = null;
        root2.left.right = null;
        root2.right.left = new BinaryTreeNode(4);
        root2.right.right = new BinaryTreeNode(5);

        if(areAnagrams(root1,root2))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
