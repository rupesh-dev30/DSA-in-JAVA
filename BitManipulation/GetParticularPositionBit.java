/*
  1) Get ith bit
                 1 0 0 0 1 0 0 1 1 0 0
     position : 10 9 8 7 6 5 4 3 2 1 0

     i = 2 then ith bit = 1
     i = 7 then ith bit = 0

     get ith bit :
     mask = 1 << i
     mask & n
*/

public class GetParticularPositionBit {
  public static void main(String[] args) {
    int n = 1100;
    int i = 2;
    int mask = 1 << i;
    
    if((n & mask) == 0){
      System.out.println("Unset Bit");
    }else{
      System.out.println("Set Bit");
    }
  }
}
