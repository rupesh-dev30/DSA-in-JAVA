/*
    QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.

    COMPLEXITIES:

    1) Time: Average Case : O(nlogn)
    2) Time: Worst Case : O(n^2)
    3) Space : O(1)

*/

public class QuickSort {
  public static int partition(int[] arr, int startIndex, int endIndex){
    int pivot = arr[endIndex];
    int i = startIndex - 1;

    for(int j=startIndex; j<endIndex; j++){
      if(arr[j] <= pivot){
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[endIndex] = arr[i];
    arr[i] = temp;

    return i;
  }

  public static void quickSort(int[] arr, int startIndex, int endIndex){
    //Base Case
    if(startIndex >= endIndex){
      return;
    }

    //Pivot Element
    int pivotIndex = partition(arr, startIndex, endIndex);
    quickSort(arr, startIndex, pivotIndex-1);
    quickSort(arr, pivotIndex+1, endIndex);
  }

  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 6, 1, 3, 4, 7};
    quickSort(arr, 0, arr.length-1);

    printArray(arr);
  }
}
