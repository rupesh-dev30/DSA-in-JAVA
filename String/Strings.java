import java.util.Scanner;

public class Strings {
  public static void main(String args[]){
    char[] arr = {'a','b','c','d'};
    String str = "abcd";
    String str2 = new String("rupesh");
    System.out.println(arr);

    //String are Immutable

    Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println(name);

    String fullName = sc.nextLine();
    System.out.println(fullName);
    System.out.println(fullName.length());


    sc.close();

  }
}
