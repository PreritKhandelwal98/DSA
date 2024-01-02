import java.util.*;

public class Tree {
    private static class Node {
        private Node left;
        private int data;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static Node root;

    public static void preOrder(Node DemoRoot) {
        if (DemoRoot == null) {
            return;
        }

        System.out.print(DemoRoot.data + " ");
        preOrder(DemoRoot.left);
        preOrder(DemoRoot.right);
    }

    public static void postOrder(Node DemoRoot) {
        if (DemoRoot == null) {
            return;
        }

        postOrder(DemoRoot.left);
        postOrder(DemoRoot.right);
        System.out.print(DemoRoot.data + " ");
    }

    public static void inOrder(Node DemoRoot) {
        if (DemoRoot == null) {
            return;
        }

        inOrder(DemoRoot.left);
        System.out.print(DemoRoot.data + " ");
        inOrder(DemoRoot.right);
    }

    public static void preOrderIterative() {
        Stack<Node> st = new Stack<>();

        if (root == null) {
            return;
        }

        st.push(root);
        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
    }

    public static void postOrderIterative() {
        Stack<Node> st = new Stack<>();
        Stack<Integer> out = new Stack<>(); // To store post-order traversal

        if (root == null) {
            return;
        }

        st.push(root);
        while (!st.isEmpty()) {
            Node temp = st.pop();
            out.push(temp.data);

            if (temp.left != null) {
                st.push(temp.left);
            }
            if (temp.right != null) {
                st.push(temp.right);
            }
        }

        while (!out.isEmpty()) {
            System.out.print(out.pop() + " ");
        }
    }

    public static void inOrderIterative() {
        Stack<Node> st = new Stack<>();

        if (root == null) {
            return;
        }

        Node current = root;
        while (current != null || !st.isEmpty()) {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(10);
        Node third = new Node(120);
        Node fourth = new Node(20);
        Node fifth = new Node(30);
        Node sixth = new Node(4);
        Node seventh = new Node(11);
        Node eighth = new Node(31);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        fourth.left = eighth;

        System.out.println("This is recursive approach");
        System.out.print("Preorder Traversal: ");
        preOrder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postOrder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inOrder(root);
        System.out.println();

        System.out.println("This is Iterative approach");
        System.out.print("Preorder Traversal: ");
        preOrderIterative();
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postOrderIterative();
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inOrderIterative();
    }
}
