import java.util.Scanner;

public class largestNumber {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a>b){
      System.out.println(a + " is greater than "+ b);
    } 
    else if(a==b){
      System.out.println(a + " is equall to "+ b);
    }
    
    else {
      System.out.println(b + " is greater than "+ a);
    }

    sc.close();
  }
}
