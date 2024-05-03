import java.util.Scanner;

public class binomialCoefficient {
  public static int factorial(int num){
    int fact = 1;
    for(int i=2 ; i<=num ; i++){
      fact *= i;
    }
    return fact;
  }

  public static int binomial(int n, int r){
    return (factorial(n)/(factorial(r)*factorial(n-r)));
  }
  
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    sc.close();

    int result = binomial(n,r);
    System.out.println(result);
  }
}
