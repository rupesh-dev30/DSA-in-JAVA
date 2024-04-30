import java.util.*;

public class Star {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();

    for(int i=1 ; i<=number ; i++){
      for(int j=0 ; j<i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
