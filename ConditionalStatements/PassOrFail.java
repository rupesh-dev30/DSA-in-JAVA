import java.util.Scanner;

public class PassOrFail {
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    sc.close();

    Strings result = (marks>=33 && marks<=100) ? "Passed" : "Fail";

    System.out.println(result);
  }
}
