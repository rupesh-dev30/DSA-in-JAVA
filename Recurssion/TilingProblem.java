public class TilingProblem {
  public static int tilingProblem(int n){
    if(n==0 || n==1) return 1;

    int verticalTile = tilingProblem(n-1);
    int horizontalTile = tilingProblem(n-2);

    int totalWays = verticalTile + horizontalTile;
    return totalWays;
  }
  public static void main(String[] args) {
    int result = tilingProblem(3);
    System.out.println(result);
  }
}
