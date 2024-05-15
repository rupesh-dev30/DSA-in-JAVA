/*
    Find number of ways to reach from (0,0) to (N-1), (M-1) in a NxM Grid.

    Allowed moves - right or down.
      Cell (X,Y)

      Down -> X+1, Y
      Right -> X, Y+1


      Another Approach or trick to solve this question

      Using permutation
        As we know in this problem, whenever we reach to destination, we travel right = m-1 and down = n-1

        1) Total Character = n-1 + m-1
            Permutation (DD RR -> DDRR, DRDR, DRRD ...)
        2) Repeating Character 
            (n-1)D and (m-1)R
        3) (n-1 + m-1)! / (n-1)! (m-1)!


*/

public class GridWays {
  public static int gridWays(int i, int j, int n, int m){
    if(i == n-1 && j == m-1){   //condition for last cell
      return 1;
    } else if(i==n || j==n){    //boundary condition
      return 0;
    }

    int w1 = gridWays(i+1, j, n, m);
    int w2 = gridWays(i, j+1, n, m);

    return w1 + w2;
  }
  public static void main(String[] args) {
    int n = 3 , m = 3;
    System.out.println(gridWays(0, 0, n, m));
  }
}
