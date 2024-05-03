import java.util.*;

public class ParameterAndArguments {
  public static int add(int a, int b) {  //parameter or formal parameter
    return a + b;
  }

  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int result = add(a, b);      //Arguments or actual parameter
    System.out.println("The sum of " + a + " and " + b + " is " + result);
  }
}
