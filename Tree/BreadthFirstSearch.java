import java.util.*;

public class BreadthFirstSearch {
  private static class Node {
    private Node left;
    private int data;
    private Node right;

    public Node(int data) {
      this.data = data;
    }
  }

  private static Node root;

  public static void BFS(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      Node temp = q.poll();
      System.out.print(temp.data + " ");

      if (temp.left != null) {
        q.offer(temp.left);
      }
      if (temp.right != null) {
        q.offer(temp.right);
      }
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

    System.out.print("Breadth First Search Traversal: ");
    BFS(root);
  }
}
