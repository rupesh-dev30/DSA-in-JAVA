public class MaxSubArraySumPrefixSum {
  public static int prefixSum(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=1 ; i<arr.length ; i++){
      arr[i] += arr[i-1];
    }

    for(int i=0 ; i<arr.length; i++){
      int sum = 0;
      for(int j=i ; j<arr.length ; j++){
        if(i == 0){
          sum = arr[j];
        }else{
          sum = arr[j] - arr[i-1];
        }
        if(sum > max){
          max = sum;
        }
      }
    }
    return max;
  }
  public static void main(Strings[] args) {
    int arr[] = {1,-2,6,-1,3};
    int result = prefixSum(arr);
    System.out.println(result);
  }
}
