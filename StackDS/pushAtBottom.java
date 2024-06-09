import java.util.*;

public class pushAtBottom {
  public static void pushAtBottom(Stack<Integer> s, int element){
    if(s.isEmpty()){
        s.push(element);
        return;
    }
    int top = s.pop();
    pushAtBottom(s, element);
    s.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);

    pushAtBottom(s, 1);

    while(!s.isEmpty()){
      System.out.print(s.pop() + " ");
    }
  }
}
