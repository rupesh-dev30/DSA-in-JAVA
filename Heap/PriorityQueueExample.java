import java.util.*;

public class PriorityQueueExample {
  static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank){
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student s2){
      return this.rank - s2.rank;
    }
  }
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

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
