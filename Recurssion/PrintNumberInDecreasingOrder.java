import java.util.Scanner;

public class PrintNumberInDecreasingOrder {
  public static void printNumber(int num){
    if(num == 0){
      return;
    }
    System.out.print(num+" ");
    printNumber(num - 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    printNumber(num);
  }
}
