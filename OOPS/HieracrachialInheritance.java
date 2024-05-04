public class HieracrachialInheritance {
  public static void main(String[] args) {
    Fish shark = new Fish();
    //shark.fly();
    shark.eat();
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

class Mammals extends Animal{
  int legs;
  void walk(){
    System.out.println("Walks");
  }
}

class Bird extends Animal{
  String wings;

  void fly(){
    System.out.println("Fly");
  }
}

class Fish extends Animal{
  String fins;

  void swim(){
    System.out.println("Swim");
  }
}

