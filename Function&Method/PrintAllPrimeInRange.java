import java.util.Scanner;

public class PrintAllPrimeInRange {
  public static boolean isPrime(int num) {
    int i = 2;
    while(i <= Math.sqrt(num)){
      if(num%i == 0){
        return false;
      }
      i++;
    }
    return true;
  }

  public static void primeNumber(int num) {
    for(int i = 2 ; i<=num ; i++){
      if(isPrime(i)){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    primeNumber(num);
  }
}
