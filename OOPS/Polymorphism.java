/*
    Polymorphism

      - Compile Time Polymorphism (Static)
          -Method Overloading:
            Multiple functions with the same name but different parameters
      
      - Runtime Polymorphism (Dynamic)
          - Method Overriding:
             

*/

public class Polymorphism {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum(4.5f,2.8f));
    System.out.println(calc.sum(1,2,5));
  }
}

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
