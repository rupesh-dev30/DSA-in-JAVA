public class NQueenCountWays {
  public static boolean isSafe(char board[][], int row, int col){
    //Vertical Up
    for(int i=row-1 ; i>=0; i--){
      if(board[i][col] == 'Q'){
        return false;
      }
    }

    //Diagonal Left Up
    for(int i=row-1, j=col-1 ; i>=0 && j>=0; i--, j--){
      if(board[i][j] == 'Q'){
        return false;
      }
    }

    //Digonal Right Up
    for(int i=row-1, j=col+1 ; i>=0 && j<board.length; i--, j++){
      if(board[i][j] == 'Q'){
        return false;
      }
    }
    return true;
  }

  public static void nQueens(char board[][], int row){
    //Base Case
    if(row == board.length){
      count++;
      return;
    }

    //Column Loop
    for(int j=0 ; j<board.length; j++){
      if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        nQueens(board, row+1);
        board[row][j] = 'x';    //Backtracking Step
      }
    }
  }

  static int count = 0;
  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];

    for(int i=0 ; i<n ; i++){
      for(int j=0 ; j<n ; j++){
        board[i][j] = 'x';
      }
    }

    nQueens(board, 0);
    System.out.println("Total Way to solve n queens problem: "+ count);
  }
}

