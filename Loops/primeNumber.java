import java.util.Scanner;

public class primeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(number == 1){
      System.out.println("Not Prime nor Composite");
      return;
    }
    
    int i = 2;
    while(i<number){
      
      if(number%i == 0){
        System.out.println("Composite Number");
        return;
      }
      i++;
    }
    System.out.println("Prime Number");
  }
}
