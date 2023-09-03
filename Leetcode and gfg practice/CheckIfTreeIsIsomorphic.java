public class CheckIfTreeIsIsomorphic {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private static boolean isIsomorphicTree(Node root1,Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.data != root2.data) return false;
        boolean case1 = isIsomorphicTree(root1.left, root2.left) && isIsomorphicTree(root1.right, root2.right);
        boolean case2 = isIsomorphicTree(root1.left, root2.right) && isIsomorphicTree(root1.right, root2.left);
        return case1 || case2;
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.right = new Node(4);

        System.out.println(isIsomorphicTree(root1,root2));
    }
}
