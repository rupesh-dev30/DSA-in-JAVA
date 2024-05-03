import java.util.Scanner;

public class PrintCharacterPattern {
  public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    for(int i=0; i<n; i++){
      for(int j=0; j<i+1; j++){
        System.out.print(ch+" ");
        ch++;
      }
      System.out.println();
    }
  }
}
