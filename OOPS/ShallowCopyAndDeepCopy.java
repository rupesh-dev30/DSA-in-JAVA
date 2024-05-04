/*
    Shallow Copy: 
    
    - When we do a copy of some entity to create two or more than two entities such that changes in one entity are reflected in the other entities as well, then we can say we have done a shallow copy. In shallow copy, new memory allocation never happens for the other entities, and the only reference is copied to the other entities. The following example demonstrates the same.


    Deep Copy:

    - When we do a copy of some entity to create two or more than two entities such that changes in one entity are not reflected in the other entities, then we can say we have done a deep copy. In the deep copy, a new memory allocation happens for the other entities, and reference is not copied to the other entities. Each entity has its own independent reference. The following example demonstrates the same.

    Lazy Copy: 

    -  A lazy copy is a combination of both shallow copy and Deep Copy. When initially copying an object, a (fast) shallow copy is used. A counter is also used to track how many objects share the data. When the program wants to modify an object, it can determine if the data is shared (by examining the counter) and can do a deep copy if necessary. Lazy copy looks to the outside just as a deep copy but takes advantage of the speed of a shallow copy whenever possible. The downside are rather high but constant base costs because of the counter. Also, in certain situations, circular references can also cause problems.

*/

public class ShallowCopyAndDeepCopy {
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
    s1.marks[2] = 100;

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

  /* 
  
  Shallow Copy Constructor
  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  */

  //Deep Copy Constructor
  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;

    //Change
    for(int i=0 ; i<3 ; i++){
      this.marks[i] = s1.marks[i];
    }
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
