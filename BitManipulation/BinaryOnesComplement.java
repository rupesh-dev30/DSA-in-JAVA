/*
   ~0 -> 1
   ~1 -> 0

   Example: 
   5:     0 0 0 0 0 0 0 0 1 0 1
  ~5:     1 1 1 1 1 1 1 1 0 1 0    -> -6  not 2
                          
  
  but after compilation it give -6

  because LSB : Least Significant Bit
          MSB : Most Significant Bit (Left Most Bit) used for distinguish negative and positive number (1: Negative and 0: Positive)


  One's Complement
  5:     0 0 0 0 0 0 0 0 1 0 1
                           + 1
         0 0 0 0 0 0 0 0 1 1 0    -> 6

         ~5 = -6
*/

public class BinaryOnesComplement {
  public static void main(String[] args) {
    System.out.println(~5);
    System.out.println(~0);
  }
}
