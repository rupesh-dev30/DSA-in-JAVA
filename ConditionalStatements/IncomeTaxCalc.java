import java.util.Scanner;

public class IncomeTaxCalc {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float income = sc.nextInt();
    sc.close();
    int tax;

    if(income < 500000){
      tax = 0;
    }
    else if((income >= 500000) && (income < 1000000)){
      tax = (int) (income * 0.2);
    }
    else{
      tax = (int) (income * 0.3);
    }

    System.out.println("Tax to be paid is: " + tax);
  }
}
