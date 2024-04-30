import java.util.Scanner;

public class halfPyramid {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      int ct = 1;
      for(int j=0; j<i+1; j++){
        System.out.print(ct+" ");
        ct++;
      }
      System.out.println();
    }

  }
}
