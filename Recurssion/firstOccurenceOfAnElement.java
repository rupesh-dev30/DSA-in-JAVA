public class firstOccurenceOfAnElement {
  public static int occurenceElement(int[] arr, int index, int key){
    if(index == arr.length){
      return -1;
    }
    if(arr[index] == key){
      return index;
    }
    int result = occurenceElement(arr, index+1, key);
    return result;
  }
  public static void main(String[] args) {
    int[] arr = { 8,3,6,9,5,10,2,5,3 };
    int result = occurenceElement(arr, 0, 17);
    System.out.println(result);
  }
}
