import java.util.Scanner;

public class plaindromeString {
  public static boolean isPalindrome(String str){
    int end = str.length() - 1;
    for(int i=0 ; i<str.length()/2; i++){
      if(str.charAt(i) == str.charAt(end)){
        end--;
      }else{
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    sc.close();

    if(isPalindrome(str)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
