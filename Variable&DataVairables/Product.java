import java.util.Scanner;

public class Product {
  public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();

    float product = a*b;
    System.out.println(product);

    sc.close();
    //sc.close() is used to close the Scanner object named sc. This is an important step because it allows Java to reclaim the memory used by the Scanner object. When you are done using a Scanner object, it is a good practice to close it to prevent memory leaks in your program. Once you close a Scanner object, you cannot reuse it, so you should close it as soon as you are done exhausting its input.
  }
}
