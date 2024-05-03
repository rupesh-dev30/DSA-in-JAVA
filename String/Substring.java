public class Substring {
  public static String subString(String str, int s, int e){
    String substr = "";
    for(int i=s ; i<e ; i++){
      substr += str.charAt(i);
    }
    return substr;
  }
  public static void main(String[] args) {
    String str = "Rupesh Kumar";
    // System.out.println(str.substring(0, 3));
    // System.out.println(str.substring(0, 6));
    // System.out.println(str.substring(0, 7));

    System.out.println(subString(str, 2, 5));
  }
}
