public class SearchInSortedMatrix {
  public static boolean SearchItem(int[][] arr, int key){
    int row = 0;
    int col = arr[0].length - 1;

    while(row <= arr.length-1 && col>=0){
       if(arr[row][col] == key){
        return true;
       }
       else if(arr[row][col] > key){
        col--;
       }
       else{
        row++;
       }
    }
    return false;
  }
  public static void main(Strings[] args) {
    int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

    if(SearchItem(arr, 100)){
      System.out.println("Element is present");
    } else{
      System.out.println("Element is not present");
    }
  }
}
