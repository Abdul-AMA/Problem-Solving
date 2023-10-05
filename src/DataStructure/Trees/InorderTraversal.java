package DataStructure.Trees;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    public static void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
}
