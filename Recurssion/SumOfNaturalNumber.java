import java.util.Scanner;

public class SumOfNaturalNumber {
  public static int sum(int num){
    if(num == 1){
      return 1;
    }

    int result = num + sum(num-1);
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = sum(num);
    System.out.println(result);
  }
}
