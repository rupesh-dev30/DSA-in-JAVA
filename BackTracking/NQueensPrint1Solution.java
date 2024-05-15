public class NQueensPrint1Solution {
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

  public static boolean nQueens(char board[][], int row){
    //Base Case
    if(row == board.length){  
      printBoard(board);
      return true;
    }

    //Column Loop
    for(int j=0 ; j<board.length; j++){
      if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        if(nQueens(board, row+1)){
          return true;
        }
        board[row][j] = 'x';    //Backtracking Step
      }
    }
    return false;
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
    int n = 4;
    char board[][] = new char[n][n];

    for(int i=0 ; i<n ; i++){
      for(int j=0 ; j<n ; j++){
        board[i][j] = 'x';
      }
    }

    if(nQueens(board, 0)){
      System.out.println("Solution is possible");
    } else {
      System.out.println("Solution is not possible");
    }
  }
}
