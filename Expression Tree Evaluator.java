class Node {
    String value;
    Node left, right;

    Node(String value) {
        this.value = value;
        left = right = null;
    }
}

public class ExpressionTree {

    // Function to evaluate the expression tree
    public static int evaluate(Node root) {
        // If it's a leaf node (number)
        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.value);
        }

        // Evaluate left and right subtree
        int leftVal = evaluate(root.left);
        int rightVal = evaluate(root.right);

        // Apply operator
        switch (root.value) {
            case "+": return leftVal + rightVal;
            case "-": return leftVal - rightVal;
            case "*": return leftVal * rightVal;
            case "/": return leftVal / rightVal;
        }

        return 0;
    }

    public static void main(String[] args) {
        /*
              *
             / \
            +   -
           / \ / \
          3  2 4  1
        */

        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");

        root.left.left = new Node("3");
        root.left.right = new Node("2");

        root.right.left = new Node("4");
        root.right.right = new Node("1");

        int result = evaluate(root);
        System.out.println("Result: " + result);
    }
}