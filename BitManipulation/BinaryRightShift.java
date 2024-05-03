/*
   Right Shift:

   20 :          1 0 1 0 0
   20 >> 2 :     0 0 1 0 1  -> 5

   a >> b -> a / 2^b
   5 >> 2 -> 5 / 2^2
   rightShift -> divide the number by 2 and so on...

*/

public class BinaryRightShift {
  public static void main(String[] args) {
    System.out.println(20>>2);
  }
}
