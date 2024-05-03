import java.util.Scanner;

public class Calculator {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt() ;
    char operator = sc.next().charAt(0);
    int b = sc.nextInt() ;
    sc.close();

    switch (operator) {
      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      case '/':
        System.out.println(a / b);
        break;
      case '%':
        System.out.println(a % b);
        break;
      default:
        System.out.println("Wrong");
        break;
    }
  }
}
