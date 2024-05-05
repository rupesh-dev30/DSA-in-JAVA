import java.util.Scanner;

public class FibonacciNumber {
  public static int fibonacci(int num) {
    if(num == 0){
      return 0;
    }
    if(num == 1){
      return 1;
    }

    int fibonacciResult = fibonacci(num-1) + fibonacci(num-2);
    return fibonacciResult;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = fibonacci(num);
    System.out.println(result);
  }
}
