import java.util.Scanner;

public class factorial {
  public static int factorial(int num){
    int fact = 1;
    for(int i=2 ; i<=num ; i++){
      fact *= i;
    }
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
