import java.util.Scanner;

public class factorial {
  public static int fact(int num){
    int f = 1;
    for(int i=2 ; i<=num ; i++){
      f *= i;
    }
    return f;
  }

  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = fact(num);
    System.out.println(result);
  }
}
