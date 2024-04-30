public class CallByValue {
  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    // System.out.println("Inside swap function");
    // System.out.println("Value of a is "+ a);
    // System.out.println("Value of a is "+ b);
  }
  public static void main(String[] args) {
    int a = 5;
    int b = 8;
    System.out.println("Before Swapping");
    System.out.println("Value of a is "+ a);
    System.out.println("Value of a is "+ b);

    swap(a,b);
    System.out.println("After Swapping");
    System.out.println("Value of a is "+ a);
    System.out.println("Value of a is "+ b);
  }
}

//Call by Value create a copy in function where it paas the parameter
