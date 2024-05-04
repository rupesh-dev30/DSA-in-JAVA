/*
    Polymorphism

      - Compile Time Polymorphism (Static)
          -Method Overloading:
            Multiple functions with the same name but different parameters
      
      - Runtime Polymorphism (Dynamic)
          - Method Overriding:
             Parent and child classes both contain the same function with different definition.
             

*/

public class Polymorphism {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum(4.5f,2.8f));
    System.out.println(calc.sum(1,2,5));

    Deer d = new Deer();
    d.eat();
  }
}

//Method Overloading
class Calculator{
  int sum(int a, int b){
    return a+b;
  }
  float sum(float a, float b){
    return a+b;
  }
  int sum(int a, int b, int c){
    return a+b+c;
  }
}

//Method Overriding
class Animal{
  void eat(){
    System.out.println("Eat Anything!");
  }
}

class Deer extends Animal{
  void eat(){
    System.out.println("Eat Veg Only!");
  }
}
