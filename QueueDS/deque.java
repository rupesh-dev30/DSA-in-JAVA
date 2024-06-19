/*
    Common mistakes:

    it is Deque not Dequeue

    Dequeue is a verb : it means deleting an element
    Deque: it means doubly ended queue

    Operations in Deque: 
      addFirst()
      addLast()
      removeFirst()
      removeLast()
      getFirst() -> peek()
      getLast()

      in Java , Deque is interface

*/
import java.util.*;
import java.util.LinkedList;
public class deque {
  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    deque.addFirst(1);
    deque.addFirst(2);
    deque.addLast(3);
    deque.addLast(4);

    System.out.println(deque);
    deque.removeFirst();
    System.out.println(deque);
    deque.removeLast();
    System.out.println(deque);
  }
}
