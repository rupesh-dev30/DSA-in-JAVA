/*
   Left Shift:

   5 :          1 0 1
   5<<2:    1 0 1 0 0   -> 20


   a << b -> a * 2^b
   5 << 2 -> 5 * 2^2
   leftShift -> multiply the number by 2 and so on...

*/

public class BinaryLeftShift {
  public static void main(String[] args) {
    System.out.println(5<<2);
  }
}
