public class CheckIfSorted {
  public static boolean isStorted(int[] arr, int i){
    if(i == arr.length - 1){
      return true;
    }
    if(arr[i] > arr[i+1]){
      return false;
    }

    return isStorted(arr, i+1);
  }
  public static void main(String[] args) {
    int[] arr = { 2,5,8,10,15,19,25 };
    System.out.println(isStorted(arr, 0));

    int[] arr1 = { 4,1,8,3,0,3,95,12,16};
    System.out.println(isStorted(arr1, 0));
  }
}
