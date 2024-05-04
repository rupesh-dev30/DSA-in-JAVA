/*
  Inheritance: 

    - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

    - The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

    - Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

    - Inheritance also represents the reusability of code. You can reuse the fields and methods of the existing class when you create a new class.

*/

public class Inheritance {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    shark.breathe();
    shark.swim();
  }
}

//Parent Class
class Animal{
  String color;

  void eat(){
    System.out.println("Eats");
  }

  void breathe(){
    System.out.println("Breathes");
  }
}

//Derived Class / Sub Class
class Fish extends Animal{
  int fins;

  void swim(){
    System.out.println("Swim");
  }
}
