/*
   0 & 0 -> 0
   0 & 1 -> 0
   1 & 0 -> 0
   1 & 1 -> 1

   Example: 
   5:     1 0 1
   6:     1 1 0
  5 & 6:  1 0 0    -> 4
*/

public class BinaryAnd {
  public static void main(String[] args) {
    System.out.println(5 & 6);
  }
}
