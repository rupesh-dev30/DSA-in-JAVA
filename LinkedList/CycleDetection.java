import org.w3c.dom.Node;

public class CycleDetection {
  public static boolean isCycle(){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast){
        return true;
      }
    }
    return false;
  }
}
