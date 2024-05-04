/*
    Abstraction:
      - Hiding all the unnecessary details and showing only the important parts to the users

      It can be implemented by two method
        1) Abstract Class     2) Interfaces


      * Difference in Abstraction and Encapsulation

      - Abstraction: 
        It is a feature of OOPs. It is used to hide the unnecessary information or data from the user but shows the essential data that is useful for the user. It can be achieved by using the interface and the abstract class. In interfaces, only the methods are exposed to the end-user. The best example of abstraction is a TV remote. The user only interacts with the outer interface that is nothing but keys. The user only knows which key to press for what function.

      - Encapsulation:
        It is also a feature of OOP. It is used to bind up the data into a single unit called class. It provides the mechanism which is known as data hiding. It is an important feature of OOPs. It prevents to access data members from the outside of the class. It is also necessary from the security point of view.



        Abstract Class: 
         - Cannot create an instance of abstract class
         - Can have abstract/non-abstract methods
         - Can have Constructors(NOTE)

*/

public class Abstraction {
  public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);

    Chicken c = new Chicken();
    c.eat();
    c.walk();

    //Not possible
    // Animal a = new Animal() {};
    
  }
}

//Abstract Class means -> no object creation
abstract class Animal{   
  String color;

  //Constructor
  Animal(){
    color = "brown";
  }   

  //Non Abstract Method
  void eat(){
    System.out.println("Animal Eat!");
  }

  //Abstract Method -> It means no implementation
  abstract void walk();
}

class Horse extends Animal{
  void changeColor(){
    color = "dark brown";
  }

  void walk(){
    System.out.println("Walks on 4 legs!");
  }
}

class Chicken extends Animal{
  void changeColor(){
    color = "yellow";
  }

  void walk(){
    System.out.println("Walks on 2 legs!");
  }
}