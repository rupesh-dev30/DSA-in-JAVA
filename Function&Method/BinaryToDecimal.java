import java.util.Scanner;

public class BinaryToDecimal {
  public static int binaryToDecimal(int n) {
    int i = 0;
    int decimal = 0;
    while(n != 0){
      int rem = n%10;
      decimal += Math.pow(2, i) * rem;
      n /= 10;
      i++;
    }
    return decimal;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int result = binaryToDecimal(num);
    System.out.println(result);
  }
}
