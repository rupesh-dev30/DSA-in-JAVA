import java.util.Arrays;

public class InbuiltSort {
  public static void main(String[] args) {
    int[] arr = {4,2,3,1,5};
    Arrays.sort(arr);
    System.out.print("Sorted array : ");
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
