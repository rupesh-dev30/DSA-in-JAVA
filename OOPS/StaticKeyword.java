/*
    Static Keyword
      - Static keyword in java is used to share the same variable or method of a given class.

        - Properties
        - Functions
        - Blocks
        - Nested Classes

      - Static keyword is used to define a static variable or method.
*/

public class StaticKeyword {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "Kendriya Vidyalaya";

    Student s2 = new Student();
    System.out.println(s2.schoolName);

    s2.schoolName = "Carmel";
    System.out.println(s1.schoolName);
  }
}

class Student{
  String name;
  int roll;

  static String schoolName;
  void setName(String name){
    this.name = name;
  }

  String getName(String name){
    return this.name;
  }
}

//Here schoolName is static, it can instantiate in main function, now the schoolName value is copy to all the object which were created by Student();