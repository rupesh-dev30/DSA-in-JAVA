import java.util.*;

public class primeNumber {
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();

    if(number == 1){
      System.out.println("Not Prime nor Composite");
      return;
    }

    int i = 2;
    while(i<=Math.sqrt(number)){
      
      if(number%i == 0){
        System.out.println("Composite Number");
        return;
      }
      i++;
    }
    System.out.println("Prime Number");
  }
}
