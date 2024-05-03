public class TypePromotionInExpression {
  public static void main(Strings[] args) {
    /* 
    
    char a = 'a';
    char b = 'b';
    System.out.println(b-a);

    */

    /* 

    char a = 'a';
    char b = 'b';
    char c = a - b;
    System.out.println(c);

    // not possible because a-b is integer and c in char. 

    */

    /* 

    short a = 5;
    byte b = 25;
    char c = 'c';
    byte bt = a+b+c;
    System.out.println(bt);

    //not possible because a+b+c is integer and bt is byte

    */

    /* 

    short a = 5;
    byte b = 25;
    char c = 'c';
    byte bt = (byte) (a+b+c);
    System.out.println(bt);

    */

    int a = 10;
    float b = 20.25f;
    long c = 25;
    double d = 30;
    double ans = a+b+c+d;
    System.out.println(ans);
  }
}

//byte , char , short convert it to int and then execute
//if any of the operand is long, float or double then result is long

//Type conversion only for experession not for variable