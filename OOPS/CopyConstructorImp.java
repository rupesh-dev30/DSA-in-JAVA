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

public class CopyConstructorImp {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Rupesh";
    s1.roll = 2236977;
    s1.password = "xyz";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;


    // Copy Constructor
    Student s2 = new Student(s1);
    s2.password = "abc";
    s1.marks[2] = 100;           // This change is after the copy constructor called , still it change the value in both the object because of shallow copy or refressing same address by both object

    for(int i=0 ; i<3 ; i++){
      System.out.println(s2.marks[i]);
    }
  }
}

class Student{
  String name;
  int roll;
  String password;
  int[] marks;
  
  //Copy Constructor
  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  Student(){
    marks = new int[3];
    System.out.println("Constructor is called...");
  }

  Student(String name){
    marks = new int[3];
    this.name = name;
  }

  Student(int roll){
    marks = new int[3];
    this.roll = roll;
  }
}