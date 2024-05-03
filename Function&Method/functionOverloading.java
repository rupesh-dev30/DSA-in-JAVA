import java.util.Scanner;

public class functionOverloading {
  public static int sum(int a, int b, int c){
    return a+b+c;
  }
  public static int sum(int a, int b){
    return a+b;
  }
  public static int sum(int a, int b, int c, int d){
    return a+b+c+d;
  }

  public static void main(Strings[] args) {
    int a = 4, b = 5, c = 2, d = 3;

    int result1 = sum(a,b);
    int result2 = sum(a,b,c);
    int result3 = sum(a,b,c,d);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }
}
