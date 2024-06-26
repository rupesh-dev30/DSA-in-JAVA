public class FindSubsets {
  public static void findSubset(String str, int index, StringBuilder ans){
    //Base Case 
    if(index == str.length()){
      if(ans.length() == 0) 
        System.out.println("NULL");

      else 
        System.out.println(ans);

      return;
    }

    //Recurssion Relation
    //YES CHOICE (if character want to come)
    findSubset(str, index+1, ans.append(str.charAt(index)));

    //Backtracking
    ans.deleteCharAt(ans.length()-1);

    //NO CHOICE (if character not want to come)
    findSubset(str, index+1, ans);

    
  }
  public static void main(String[] args) {
    String str = "abc";
    findSubset(str, 0, new StringBuilder(""));
  }
}
