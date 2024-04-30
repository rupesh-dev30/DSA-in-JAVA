import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int i = 1;
    while(i<=number){
      System.out.println(i);
      i++;
    }
  }
}
