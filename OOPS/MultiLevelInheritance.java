public class MultiLevelInheritance {
  public static void main(String[] args) {
    Dog dobby = new Dog();
    dobby.color = "Black";
    dobby.legs = 4;
    dobby.bark();
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
class Mammals extends Animal{
  int legs;
  void walk(){
    System.out.println("Walks");
  }
}

//Sub Derived Class
class Dog extends Mammals{
  String breed;

  void bark(){
    System.out.println("Barks");
  }
}