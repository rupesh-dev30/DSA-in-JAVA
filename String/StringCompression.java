//Input -> "aaabbcccdd" 
//Output -> "a3b2c3d2"

//Time Complexity -> O(n)
//Space Complexity -> O(n)

public class StringCompression {
  public static String stringCompression(String str){
    String newStr = "";

    for(int i=0 ; i<str.length() ; i++){
      Integer count = 1;
      while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if(count > 1){
        newStr += count.toString();
      }
    }
    return newStr;
  }
  public static void main(String[] args) {
    String str = "aabc";
    System.out.println(stringCompression(str));
  }
}
