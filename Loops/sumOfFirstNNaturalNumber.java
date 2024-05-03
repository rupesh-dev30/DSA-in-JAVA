import java.util.Scanner;

public class sumOfFirstNNaturalNumber {
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = 1;
    int sum = 0;
    while(i<=num){
      sum += i;
      i++;
    }

    System.out.println("sum is "+sum);
  }
}
