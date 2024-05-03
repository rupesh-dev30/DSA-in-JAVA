public class InsertionSort {
  public static void insertionSort(int[] arr){
    for(int i=1 ; i<arr.length ; i++){
      int curr = arr[i];
      int prev = i-1;
      while(prev >= 0 && arr[prev] > curr){
        arr[prev+1] = arr[prev];
        prev--;
      }
      arr[prev+1] = curr;
    }
  }
  public static void main(Strings args[]){
    int[] arr = {23,56,11,67,45,10,5,32,89};
    insertionSort(arr);
    System.out.print("Sorted array : ");
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
