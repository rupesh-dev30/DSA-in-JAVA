import java.util.*;

public class QueueCollection {
  public static void main(String[] args) {
    // Queue q = new Queue(5);
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> dq = new ArrayDeque<>();
    //We cant create a object of queue because queue is interface. LinkedList and ArrayDeque are the two class which implement queue in java.
      
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }

    dq.add(1);
    dq.add(2);
    dq.add(3);
    dq.add(4);
    dq.add(5);

    while(!dq.isEmpty()){
      System.out.println(dq.peek());
      dq.remove();
    }
  }
}
