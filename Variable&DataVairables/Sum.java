import java.util.Scanner;

public class Sum {
  public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a+b;
    System.out.println(sum);
    sc.close();
  }
}