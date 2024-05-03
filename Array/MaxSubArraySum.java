public class MaxSubArraySum {
  public static int maxSubArraySum(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      int sum = arr[i];
      for (int j = i+1; j < arr.length; j++) {
        sum = sum + arr[j];
        if (sum > max) {
          max = sum;
        }
      }
    }
    return max;
  }

  public static void main(Strings[] args) {
    int arr[] = { 1,-2,6,-1,3 };

    int result = maxSubArraySum(arr);
    System.out.println(result);
  }
}
