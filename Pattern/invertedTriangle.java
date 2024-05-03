import java.util.Scanner;

public class invertedTriangle {
  public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();

    for(int i=0 ; i<number ; i++){
      for(int j=0 ; j<number-i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
