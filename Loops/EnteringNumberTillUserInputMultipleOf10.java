import java.util.Scanner;

public class EnteringNumberTillUserInputMultipleOf10 {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);

    while(true){
      int num = sc.nextInt();
      if(num % 10 == 0){
        break;
      }
      else{
        System.out.println(num);
      }
    }
  }
}
