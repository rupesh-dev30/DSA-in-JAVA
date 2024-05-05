import java.util.Scanner;

public class Factorial {
  public static int factorial(int num){
    if(num == 1 || num == 0){
      return 1;
    }
    int fact = num * factorial(num - 1);
    return fact;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = factorial(num);
    System.out.println(result);
  }
}
