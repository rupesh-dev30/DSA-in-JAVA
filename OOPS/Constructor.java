/*
    Constructor is a special method which is invoked automatically at the time of object creation

    - Constructors have the same name as class or structure.
    - Constructors dont have a return type. (Not even void)
    - Constructors are only called once, at object creation.
    - Memory allocation happends when constructor is called


    Types of Constructor: 
    1. Default Constructor / Non Parameterized Constructor
    2. Parameterized Constructor
    3. Copy Constructor
  
*/

public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Rupesh", 2236977);
    System.out.println(s2.name);
    System.out.println(s2.roll);
  }
}

class Student{
  String name;
  int roll;

  //Default Constructor
  Student(){
    System.out.println("Default Constructor Called!");
  }

  //Parameterized Constructor
  Student(String name , int roll){
    System.out.println("Parameterized Constructor Called!");
    this.name = name;
    this.roll = roll;
  }
}
