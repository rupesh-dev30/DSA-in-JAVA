import java.util.Scanner;

public class largestOf3Number {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    if(a>b && a>c){
      System.out.println(a + " is greater!");
    }
    else if(b>a && b>c){
      System.out.println(b + " is greater!");
    }
    else{
      System.out.println(c + " is greater!");
    }
  }
}
