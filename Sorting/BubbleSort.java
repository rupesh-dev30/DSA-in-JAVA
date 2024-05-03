public class BubbleSort {
  public static void bubbleSort(int[] arr){
    for(int i=0 ; i<arr.length-1 ; i++){
      for(int j=0 ; j<arr.length-i-1 ; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void main(Strings[] args) {
    int[] arr = {23,56,11,67,45,10,5,32,89};
    bubbleSort(arr);
    System.out.print("Sorted array : ");
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
