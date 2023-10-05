package DataStructure.Trees;

public class PostorderTraversal {
    public static void main(String[] args) {

    }

    public static void postOrder(Node root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
