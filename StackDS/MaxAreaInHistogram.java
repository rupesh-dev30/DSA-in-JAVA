import java.util.*;

public class MaxAreaInHistogram {
  public static void maximumArea(int[] heights){
    int maxArea = 0;
    int[] smallerRight = new int[heights.length];
    int[] smallerLeft = new int[heights.length];

    //Next Smaller Right
    Stack<Integer> s = new Stack<>();

    for(int i=heights.length-1; i>=0; i--){
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
        s.pop();
      }
      if(s.isEmpty()){
        smallerRight[i] = heights.length;
      } else {
        smallerRight[i] = s.peek();
      }
      s.push(i);
    }

    //Next Smaller Left
    s = new Stack<>();

    for(int i=0; i<heights.length; i++){
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
        s.pop();
      }
      if(s.isEmpty()){
        smallerLeft[i] = -1;
      } else {
        smallerLeft[i] = s.peek();
      }
      s.push(i);
    }

    //Current area  width = j - i - 1 = smallerRight[i] - smallerLeft[i] - 1
    for(int i=0; i<heights.length; i++){
      int height = heights[i];
      int width = smallerRight[i] - smallerLeft[i] - 1;
      int currArea = height * width;
      maxArea = Math.max(currArea, maxArea);
    }

    System.out.println("Max area in histogram = " + maxArea);

  }
  public static void main(String[] args) {
    int[] heights = {2,1,5,6,2,3};
    maximumArea(heights);
  }
}
