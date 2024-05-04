/*
    Super Keyword
      - Super keyword is used to refer immediate parent class object.

      - to access parent's properties
      - to access parent's function
      - to access parent's constructor

 */

public class SuperKeyword {
  public static void main(String[] args) {
    Horse horse = new Horse();
    System.out.println(horse.color);
    
  }
}

class Animal{
  String color;
  Animal(){
    System.out.println("Animal Constructor is called!");
  }
}

class Horse extends Animal{
  Horse(){
    // super();
    super.color = "Brown";
    System.out.println("Horse Constructor is called!");
  }
}

class mustang extends Horse{
  mustang(){
    super();
    System.out.println("Mustang Constructor is called!");
  }
}