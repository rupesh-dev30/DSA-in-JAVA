public class SpiralMatrix {
  public static void printSpiral(int[][] arr){
    int startRow = 0;
    int startCol = 0;
    int endRow = arr.length - 1;
    int endCol = arr[0].length-1;

    while(startRow <= endRow && startCol <= endCol){
      //Top
      for(int i=startCol ; i<=endCol ; i++){
        System.out.print(arr[startRow][i]+" ");
      }

      //Right
      for(int i=startRow+1; i<=endRow ; i++){
        System.out.print(arr[i][endCol]+" ");
      }

      //Bottom
      for(int i=endCol-1; i>=startCol ; i--){
        if(startRow == endRow){
          break;
        }
        System.out.print(arr[endRow][i]+" ");
      }

      //left
      for(int i=endRow-1 ; i>=startRow+1; i--){
        if(startCol == endCol){
          break;
        }
        System.out.print(arr[i][startCol]+" ");
      }
      startCol++;
      startRow++;
      endCol--;
      endRow--;
    }
  }
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    printSpiral(arr);
  }
}
 