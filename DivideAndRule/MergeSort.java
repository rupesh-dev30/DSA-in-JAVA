/*
    Merge Sort
    
    Merge sort is a popular sorting algorithm known for its efficiency and stability. It follows the divide-and-conquer approach to sort a given array of elements.

    Steps:

    1) Divide: Divide the list or array recursively into two halves until it can no more be divided.

    2) Conquer: Each subarray is sorted individually using the merge sort algorithm.

    3) Merge: The sorted subarrays are merged back together in sorted order. The process continues until all elements from both subarrays have been merged.
    
*/

public class MergeSort {
  public static void mergeSort(int[] arr, int start, int end){
    if(start == end){
      return;   //Nothing To Sort
    }
    int mid = start + (end-start)/2;

    //Left Part Sort
    mergeSort(arr, start, mid);
    //Right Part Sort
    mergeSort(arr, mid+1, end);
    //Merge
    merge(arr, start, mid, end);
  }

  public static void merge(int[] arr, int start, int mid, int end){
    int[] temp = new int[end - start + 1];

    int leftPointer = start;  //iterator for left part
    int rightPointer = mid + 1;  //iterator for right part
    int k = 0;  //iterator for temp arr;

    while(leftPointer <= mid && rightPointer <= end){
      if(arr[leftPointer] < arr[rightPointer]){
        temp[k++] = arr[leftPointer++];
      } else {
        temp[k++] = arr[rightPointer++];
      }
    }
    
    while(leftPointer <= mid){
      temp[k++] = arr[leftPointer++];
    }

    while(rightPointer <= end){
      temp[k++] = arr[rightPointer++];
    }

    //Copy the temp to original arr
    for(int i=start, j = 0 ; j<temp.length; i++, j++){
      arr[i] = temp[j];
    }  
  }

  public static void printArray(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {4,9,1,6,3,8,2};
    mergeSort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
