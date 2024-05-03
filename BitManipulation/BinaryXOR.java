/*
   0 ^ 0 -> 0
   0 ^ 1 -> 1
   1 ^ 0 -> 1
   1 ^ 1 -> 0

   Example: 
   5:     1 0 1
   6:     1 1 0
  5 ^ 6:  0 1 1   -> 3
*/

public class BinaryXOR {
  public static void main(String[] args) {
    System.out.println(5 ^ 6);
  }
}
