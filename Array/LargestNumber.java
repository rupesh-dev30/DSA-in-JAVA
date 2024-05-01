public class LargestNumber {
  public static int checkMaximum(int arr[]) {
    int max = Integer.MIN_VALUE;
    for(int i=0 ; i<arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
  
  public static void main(String[] args) {
    int arr[] = {100,10,56,670,50,679,1003,3456};
    
    int result = checkMaximum(arr);
    System.out.println(result);
  }
}