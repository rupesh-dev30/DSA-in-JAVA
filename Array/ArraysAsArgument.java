public class ArraysAsArgument {
  public static void update(int marks[]) {
    for(int i=0 ; i<marks.length; i++){
      marks[i] += 1;
    }
  }

  public static void main(Strings[] args) {

    int marks[] = { 98, 96, 99 };
    update(marks);
    for(int i=0 ; i<marks.length; i++){
      System.out.println(marks[i]);
    }
  }
}
