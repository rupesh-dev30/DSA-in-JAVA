public class RemoveDuplicatesInString {
  public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
    if(index == str.length()){
      System.out.println(newStr);
      return;
    }

    char currChar = str.charAt(index);
    if(map[currChar - 'a'] == true) {
      removeDuplicates(str, index + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicates(str, index+1, newStr.append(currChar), map);
    }
  }
  public static void main(String[] args) {
    String string = "rupeshrupeshkumarkumar";
    removeDuplicates(string, 0, new StringBuilder(""), new boolean[26]);
  }
}
