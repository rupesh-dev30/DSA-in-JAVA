public class overloadingDatatype {
  public static int sum(int a, int b) {
    return a + b;
  }
  public static float sum(float a, float b) {
    return a + b;
  }
  public static double sum(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {
    int a = 10, b = 20;
    float c = 15.9f, d = 23.4f;
    double e = 12.45, f = 10.43;

    System.out.println("Sum " + sum(a, b));
    System.out.println("Sum " + sum(c, d));
    System.out.println("Sum " + sum(e, f));
  }
}
