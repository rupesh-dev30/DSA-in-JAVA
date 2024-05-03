import java.util.Scanner;

public class ReverseNumber {
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();
    int reverse = 0;
    
    while(number != 0){
      int rem = number%10;
      System.out.print(rem);
      number = number/10;
    }
  }
}
