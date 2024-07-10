import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfATree {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // public static void kthlLevel(Node root, int k) {
  //   if (root == null)
  //     return;

  //   Queue<Node> q = new LinkedList<>();
  //   q.add(root);
  //   q.add(null);
  //   int level = 1;

  //   while (!q.isEmpty()) {
  //     Node curr = q.remove();
  //     if (curr == null) {
  //       if (q.isEmpty())
  //         break;
  //       else {
  //         q.add(null);
  //         level++;
  //       }
  //     } else {
  //       if (level == k) {
  //         System.out.print(curr.data + " ");
  //       }
  //       if (curr.left != null) {
  //         q.add(curr.left);
  //       }
  //       if (curr.right != null) {
  //         q.add(curr.right);
  //       }
  //     }
  //   }
  // }

  public static void kthLevelRec(Node root, int level, int k){
    if(root == null){
      return;
    }

    if(level == k){
      System.out.print(root.data + " ");
      return;
    }

    kthLevelRec(root.left, level+1, k);
    kthLevelRec(root.right, level+1, k);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // kthlLevel(root,3);
    kthLevelRec(root,1,3);
  }
}
