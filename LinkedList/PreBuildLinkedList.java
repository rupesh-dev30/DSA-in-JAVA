import java.util.LinkedList;

public class PreBuildLinkedList {
  public static void main(String[] args) {
    //Create -only object i.e., Integer, Float, Character
    LinkedList<Integer> ll = new LinkedList<>();

    //Add
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    System.out.println(ll);
    //Remove
    ll.removeFirst();
    System.out.println(ll);

    ll.removeLast();
    System.out.println(ll);
  }
}
