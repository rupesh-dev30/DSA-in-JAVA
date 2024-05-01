import java.util.Scanner;

public class array {
  public static void main(String args[]){
    int marks[] = new int[10];
    int numbers[] = {1,2,3};

    String fruitsName[] = {"Apple", "Mango", "Banana" };
    System.out.println(fruitsName[0]);
    System.out.println(fruitsName[1]);
    System.out.println(fruitsName[2]);  

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of 3 subjects");
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    sc.close();
    System.out.println("The marks are: ");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    marks[2] = 100;
    System.out.println(marks[2]);
    
  }
}
