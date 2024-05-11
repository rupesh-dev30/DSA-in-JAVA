/*

  Binary String Problem

  Print all binary strings of size N without consecutive ones

  " 010011 " -> Not Valid because multiple of 1 comming together
  " 01010101 " -> Valid
  " 0000010010" -> Valid

*/

public class BinaryStringProblem {
  public static void printBinaryString(int n, int lastPlace, String str){
    if(n==0){
      System.out.println(str);
      return;
    }
    if(lastPlace == 0){
      printBinaryString(n-1, 0, str+"0");
      printBinaryString(n-1, 1, str+"1");
    } else {
      printBinaryString(n-1, 0, str+"0");
    }
  }
  public static void main(String[] args) {
    printBinaryString(3, 0, "");
  }
}
 