public class StringCharAt {
  public static void printLetter(String str){
    for(int i=0 ; i<str.length() ; i++){
      System.out.println(str.charAt(i));
    }
  }
  public static void main(String[] args) {
    String str = "Rupesh";

    printLetter(str);
  }
}
