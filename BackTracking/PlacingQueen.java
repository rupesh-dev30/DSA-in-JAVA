public class PlacingQueen {
  public static void nQueens(char board[][], int row){
    //Base Case
    if(row == board.length){
      printBoard(board);
      return;
    }

    //Column Loop
    for(int i=0 ; i<board.length; i++){
      board[row][i] = 'Q';
      nQueens(board, row+1);
      board[row][i] = 'x';    //Backtracking Step
    }
  }

  public static void printBoard(char board[][]){
    System.out.println("-------------Chess Board-------------");
    for(int i=0 ; i<board.length; i++){
      for(int j=0 ; j<board.length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 2;
    char board[][] = new char[n][n];

    for(int i=0 ; i<n ; i++){
      for(int j=0 ; j<n ; j++){
        board[i][j] = 'x';
      }
    }

    nQueens(board, 0);
  }
}
