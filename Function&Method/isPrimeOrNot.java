import java.util.Scanner;
import java.math.*;

public class isPrimeOrNot {
  public static Strings isPrime(int num) {
    if(num == 1){
      return "Neither prime nor composite!";
    }
    int i = 2;
    while(i <= Math.sqrt(num)){
      if(num%i == 0){
        return "Not a Prime number!";
      }
      i++;
    }
    return "Prime Number!";
  }
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    Strings result = isPrime(num);
    System.out.println(result);
  }
}
