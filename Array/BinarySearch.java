import java.util.Scanner;

public class BinarySearch {
  public static boolean binarySearch(int arr[], int key){
    int start = 0; 
    int end = arr.length;
    int mid = start + (end - start)/2;

    while(start <= end){
      if(arr[mid] == key){
        return true;
      }
      else if(arr[mid] > key){
        end = mid - 1;
      }
      else{
        start = mid + 1;
      }
      mid = start + (end - start)/2;
    }
    return false;
  }

  public static void main(Strings[] args) {
    int arr[] = { 10 , 15, 18, 24, 80, 102, 150, 190, 234, 456, 510, 620};

    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();
    sc.close();

    if(binarySearch(arr,key)){
      System.out.println("Key is present in a given array");
    }else{
      System.out.println("Key is not present in a given array");
    }
  }
}
