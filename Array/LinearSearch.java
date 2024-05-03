public class LinearSearch {
  public static boolean linearSearch(int numbers[], int key){
    for(int i=0 ; i<numbers.length ; i++){
      if(numbers[i] == key){
        return true;
      }
    }
    return false;
  }

  public static void main(Strings args[]){
    int numbers[] = { 2,4,6,8,10,12,16,18};
    int key = 101;

    if(linearSearch(numbers, key)){
      System.out.println("Key is present in the given array!");
    }
    else{
      System.out.println("Key is not present in the given array!");
    }
  }
}
