public class SelectionSort {
  public static void selectionSort(int[] arr){
    for(int i=0 ; i<arr.length-1 ; i++){
      int minPosition = i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[minPosition] > arr[j]){
          minPosition = j;
        }
      }
      int temp = arr[minPosition];
      arr[minPosition] = arr[i];
      arr[i] = temp;
    }
  }
  public static void main(Strings[] args) {
    int[] arr = {23,56,11,67,45,10,5,32,89};
    selectionSort(arr);
    System.out.print("Sorted array : ");
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
