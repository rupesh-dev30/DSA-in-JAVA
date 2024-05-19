public class LinkedList1 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
    //Create New Node
    Node newNode = new Node(data);

    if(head == null){
      head = tail = newNode;
      return;
    }
    
    //newNode next = head
    newNode.next = head;

    head = newNode;
  }

  public static void main(String[] args) {
    LinkedList1 l1 = new LinkedList1();
    l1.addFirst(1);
    l1.addFirst(2);
  }
}
