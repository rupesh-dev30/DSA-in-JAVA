public class KadaneAlgoritm {
  public static int kadaneAlgorithm(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int i=0 ; i<arr.length ; i++){
      currentSum += arr[i];
      if(currentSum < 0){
        currentSum = 0;
      }
      maxSum = Math.max(currentSum,maxSum);
    }

    if(maxSum == 0){
      maxSum = Integer.MIN_VALUE;
      for(int i=0; i<arr.length ; i++){
        if(arr[i] > maxSum){
          maxSum = arr[i];
        }
      }
      return maxSum;
    }
    return maxSum;
  }
  public static void main(Strings[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    int result = kadaneAlgorithm(arr);
    System.out.println(result);
  }
}
