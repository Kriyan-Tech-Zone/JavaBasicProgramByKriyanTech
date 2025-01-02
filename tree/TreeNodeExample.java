package tree;

public class TreeNodeExample {
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int sum = sumOfAllNodes(root);
        System.out.println("Sum of All Nodes::"+sum);
    }

    static int sumOfAllNodes(Node root){        
        if(root == null)  {
            System.out.println("root is null");
            return 0;
        }
        System.out.println("root left::"+root.data);
        int sumOfLeftNodes = sumOfAllNodes(root.left);
        System.out.println("root is right::"+root.data);
        int sumOfRightNodes = sumOfAllNodes(root.right);
        System.out.println("root is return::"+root.data);
        return sumOfLeftNodes+sumOfRightNodes+ root.data;
    }
}

class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        left = right = null;
        this.data = data;
    }

}