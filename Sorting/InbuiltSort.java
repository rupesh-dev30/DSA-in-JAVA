import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
  public static void main(String[] args) {
    int[] arr = {4,2,3,1,5};
    Arrays.sort(arr);
    System.out.print("Sorted array : ");
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

    int[] arr1 = { 4,7,2,17,78,8,9,1 };
    Arrays.sort(arr1, 0 , 3);
    for(int i=0 ; i<arr1.length; i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println();

    Integer[] arr2 = { 4,7,2,17,78,8,9,1 };
    Arrays.sort(arr2, Collections.reverseOrder());
    for(int i=0 ; i<arr2.length; i++){
      System.out.print(arr2[i]+" ");
    }
  }
}
