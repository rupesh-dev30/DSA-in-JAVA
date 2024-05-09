import java.util.Scanner;

public class powerOptimized {
  public static int power(int x , int n){
    if(n == 0){
      return 1;
    }

    int halfPower = power(x , n/2);
    int halfPowerSquare = halfPower * halfPower;

    if(n%2 != 0){
      halfPowerSquare = x * halfPowerSquare;
    }

    return halfPowerSquare;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    sc.close();
    int result = power(x,n);
    System.out.println(result);
  }
}