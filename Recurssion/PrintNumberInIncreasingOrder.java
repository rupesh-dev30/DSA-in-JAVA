import java.util.Scanner;

public class PrintNumberInIncreasingOrder {
  public static void printNumber(int num){
    if(num == 0){
      return;
    }
    printNumber(num - 1);
    System.out.print(num+" ");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    printNumber(num);
  }
}
