/*
    Constructor is a special method which is invoked automatically at the time of object creation

    - Constructors have the same name as class or structure.
    - Constructors dont have a return type. (Not even void)
    - Constructors are only called once, at object creation.
    - Memory allocation happends when constructor is called

*/

public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student("Rupesh", 2236977);
    System.out.println(s1.name);
    System.out.println(s1.roll);
  }
}

class Student{
  String name;
  int roll;

  Student(String name , int roll){
    System.out.println("Constructor Called!");
    this.name = name;
    this.roll = roll;
  }
}
