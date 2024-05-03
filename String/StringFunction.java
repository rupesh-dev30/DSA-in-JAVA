public class StringFunction {
  public static void main(String[] args) {
    String str1 = "Rupesh";
    String str2 = "Rupesh";
    String str3 = new String("Rupesh");

    if(str1 == str2){
      System.out.println("String are equal!");
    }else{
      System.out.println("String are not equal!");
    }

    if(str1 == str3){
      System.out.println("String are equal!");
    }else{
      System.out.println("String are not equal!");
    }

    if(str1.equals(str3)){
      System.out.println("String are equal!");
    }else{
      System.out.println("String are not equal!");
    }
  }
}
