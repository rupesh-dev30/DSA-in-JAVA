import java.util.Scanner;

public class TernaryOperator {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();

    System.out.println(a%2==0 ? "even" : "odd");
  }
}
