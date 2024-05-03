public class PairsInAnArray {
  public static void makePair(int arr[]){
    for(int i=0 ; i<arr.length-1 ; i++){
      for(int j=i+1 ; j<arr.length ; j++){
        System.out.print("( "+arr[i]+", "+arr[j]+ " ) ");
      }
      System.out.println();
    }
  }

  public static void main(Strings[] args) {
    int arr[] = {2,4,6,8,10};
    //output: (2,4), (2,6) , (2,8), (2,10) ...
    //total number of pairs = n(n+1)/2

    makePair(arr);
  }
}
