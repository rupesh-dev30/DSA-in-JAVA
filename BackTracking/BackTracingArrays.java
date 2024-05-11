public class BackTracingArrays{
  public static void changeArray(int arr[], int index, int val){
    //base Case
    if(index == arr.length){
      printArray(arr);
      return;
    }
    //Recurssion
    arr[index] = val;
    changeArray(arr, index+1, val+1);
    arr[index] = arr[index] - 2;
  }

  public static void printArray(int arr[]){
    for(int i=0 ; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    changeArray(arr, 0, 1);

    printArray(arr);
  }
}