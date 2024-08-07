import java.util.*;

public class PriorityQueueExample {
  public static void main(String[] args) {
    // PriorityQueue<Integer> pq = new PriorityQueue<>();    //increasing order
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   //decreasing order

    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(7);

    while(!pq.isEmpty()){
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}
