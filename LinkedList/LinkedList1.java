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

  public void addLast(int data){
    //Create New Node
    Node newNode = new Node(data);

    if(head == null){
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void print(){
    Node temp = head;
    if(head == null){
      System.out.println("Linked List is Empty!!");
      return;
    }

    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList1 l1 = new LinkedList1();
    l1.print();
    l1.addFirst(2);
    l1.print();
    l1.addFirst(1);
    l1.print();
    l1.addLast(3);
    l1.print();
    l1.addLast(4);
    l1.print();
    
  }
}
