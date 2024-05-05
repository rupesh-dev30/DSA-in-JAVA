public class lastOccurenceOfAnElement {
  public static int occurenceElement(int[] arr, int index, int key){
    if(index == arr.length){
      return -1;
    }
    int isFound = occurenceElement(arr, index+1, key);
    if(isFound == -1 && arr[index] == key){
      return index;
    }
    return isFound;
  }
  public static void main(String[] args) {
    int[] arr = { 8,3,6,9,5,10,2,5,3 };
    int result = occurenceElement(arr, 0, 5);
    System.out.println(result);
  }
}

