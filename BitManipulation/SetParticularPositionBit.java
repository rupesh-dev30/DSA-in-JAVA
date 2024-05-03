/*
  2) Set ith bit
                  1 0 0 0 1 0 0 1 1 0 0
     position :  10 9 8 7 6 5 4 3 2 1 0

     i = 2 then ith bit = 1 change to 1 (no change)
     i = 7 then ith bit = 0 change to 1

     Final Result: 1 0 0 1 1 0 0 1 1 0 0

     get ith bit :
     mask = 1 << i
     mask | n
*/

public class SetParticularPositionBit {
  public static void main(String[] args) {
    int n = 1100;
    int i = 7;
    int mask = 1 << i;
    
    System.out.println(n | mask);
  }
}

