/*
    NOTE: Class is a blueprint of a object!

    Interfaces:
     - It is a blueprint of a class
     - Multiple Inheritance(5th type of inheritance)
       (in c++ , multiple inheritance implement directly but in java we use interfaces).

     - All methods are public, abstract & without implementation
     - Used to achieve total abstraction
     - Variables in the interface are final, pubic and static


     
    Why use interfaces?
     - To achieve security - hide certain details and only show the important details of an object (interface).



     class -> extends
     interface -> implements
*/

public class Interfaces {
  public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
  }
}

interface ChessPlayer{
  void moves();
}

class Queen implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right, diagonal");
  }
}

class Rook implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right");
  }
}

class King implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right, diagonal");
  }
}
