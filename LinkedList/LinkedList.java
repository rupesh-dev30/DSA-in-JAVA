public class LinkedList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // Methods

  public static void main(String[] args) {
    LinkedList li = new LinkedList();
    li.head = new Node(1);
    li.head.next = new Node(2);
  }
}
