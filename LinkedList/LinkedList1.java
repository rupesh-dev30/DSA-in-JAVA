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
  public static int size;

  public void addFirst(int data){
    //Create New Node
    Node newNode = new Node(data);
    size++;

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
    size++;

    if(head == null){
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void addMiddle(int index, int data){
    if(index == 0){
      addFirst(data);
    }
    
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while(i<index-1){
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  //Delete first node in linked list
  public int deleteFirst(){
    if(size == 0){
      System.out.println("Linked list is infinity!");
      return Integer.MIN_VALUE;
    } else if(size == 1){
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  //Delete node from Last
  public int deleteLast(){
    if(size == 0){
      System.out.println("Linked list is empty!");
      return Integer.MIN_VALUE;
    } else if(size == 1){
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    // Node temp = head;
    // while(temp.next != tail){
    //   temp = temp.next;
    // }

    Node prev = head;
    for(int i=0; i<size-2 ; i++){
      prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
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

  public int iterativeSearch(int key){
    Node temp = head;
    int i = 0;
    while(temp != null){
      if(temp.data == key){
        return i;
      }
      temp = temp.next;
      i++;
    }

    return -1;
  }

  public int recurssiveSearch(Node head, int key){
    if(head == null){
      return -1;
    }

    if(head.data == key){
      return 0;
    }

    int index = recurssiveSearch(head.next, key);
    if(index == -1){
      return -1;
    }
    return index + 1;
  }

  public void reverseLinkedList(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void deleteNthFromEnd(int n){
    //Calculate size
    int s = 0;
    Node temp = head;
    while(temp != null){
      temp = temp.next;
      s++;
    }

    if(n == s){   //element to be deleted from first
      head = head.next;
      return;
    }

    int i = 1;
    int iToFind = s - n;
    Node prev = head;
    while(i < iToFind){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }

  //Find Middle Linked List
  public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  
  public boolean checkPalindrome(){
    if(head == null || head.next == null){
      return true;
    }
    //Step 1 - Find Mid
    Node midNode = findMid(head);

    //Step 2 - Reverse Second half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;

    //Step 3 - Check left and right half
    while(right != null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public static void main(String[] args) {
    LinkedList1 l1 = new LinkedList1();
    // l1.print();
    // l1.addFirst(2);
    // l1.print();
    // l1.addFirst(1);
    // l1.print();
    // l1.addLast(3);
    // l1.print();
    // l1.addLast(4);
    // l1.print();
    // l1.addMiddle(3, 5);
    // l1.print();
    // l1.addMiddle(3, 6);
    // l1.print();
    // l1.addMiddle(3, 7);
    // l1.print();

    // System.out.println(l1.size);

    // System.out.println("Deleted Element: "+ l1.deleteFirst());
    // l1.print();
    // System.out.println(l1.size);
    
    // System.out.println("Delete Element: "+ l1.deleteLast());
    // l1.print();
    // System.out.println(l1.size);

    // System.out.println("Delete Element: "+ l1.deleteLast());
    // l1.print();
    // System.out.println(l1.size);


    // System.out.println(l1.iterativeSearch(5));
    // System.out.println(l1.iterativeSearch(10));
    // System.out.println(l1.recurssiveSearch(head,5));
    // System.out.println(l1.recurssiveSearch(head,10));
    // l1.reverseLinkedList();
    // l1.print();

    l1.addLast(1);
    l1.addLast(2);
    l1.addLast(2);
    l1.addLast(2);
    System.out.println(l1.checkPalindrome());
  }
}
