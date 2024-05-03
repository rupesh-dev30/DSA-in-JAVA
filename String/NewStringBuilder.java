public class NewStringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++){
      sb.append(ch);
    }
    System.out.println(sb);

    //to.String() work only for object
    /*  
      Not Possible

      int a = 10;
      a.toString();
    */

    /* 
      Possible

      Integer b = 10;
      b.toString();
    */
    

  }
}
