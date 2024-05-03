import java.util.Scanner;

public class ProductOfTwoNumber {
  public static int product(int a, int b) {
    return a * b;
  }

  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    int result = product(a, b);
    System.out.println(result);
  }
}
