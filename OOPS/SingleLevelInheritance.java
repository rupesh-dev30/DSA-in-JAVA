public class SingleLevelInheritance {
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
