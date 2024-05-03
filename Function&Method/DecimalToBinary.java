import java.util.Scanner;

public class DecimalToBinary {
  public static int decimalToBinary(int num){
    int binary = 0;
    int i = 1;
    while(num != 0){
      int rem = num%2;
      binary = binary + (rem * i);
      i = i * 10;
      num /= 2;
    }
    return binary;
  }
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = decimalToBinary(num);
    System.out.println(result);
  }
}
