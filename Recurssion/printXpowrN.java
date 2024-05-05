import java.util.Scanner;

public class printXpowrN {
  public static int power(int x, int n){
    if(n == 0){
      return 1;
    }
    if(x == 0){
      return 0;
    }

    int xpn = x * power(x, n-1);
    return xpn;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    sc.close();
    int xpn = power(x, n);
    System.out.println(xpn);
  }
}
