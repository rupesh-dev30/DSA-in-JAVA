public class SmallestNumber {
  public static int checkMaximum(int arr[]) {
    int min = Integer.MAX_VALUE;
    for(int i=0 ; i<arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }
  
  public static void main(String[] args) {
    int arr[] = {100,10,56,670,50,679,1003,3456};
    
    int result = checkMaximum(arr);
    System.out.println(result);
  }
}