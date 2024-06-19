/*
    Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack

    example : 
      value: [60,100,120]
      weights: [10,20,30]
      maxWeight = 50

      ans = 240


    approach: we have to sort accroding to those who have greater value and smaller weight

    so taking ratio : value/weight

*/
import java.util.*;
public class FractionalKnapsack {
  public static void main(String[] args) {
    int[] weights = {10,20,30};
    int[] values = {60,100,120};
    int maxWeight = 50;

    double ratio[][] = new double[values.length][2];
    //0th col = index
    //1st col = ratio

    for(int i=0; i<values.length; i++){
      ratio[i][0] = i;
      ratio[i][1] = values[i] / (double) weights[i];
    }

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    int capacity = maxWeight;
    int ans = 0;
    for(int i=ratio.length-1; i>=0; i--){
      int index = (int) ratio[i][0];
      if(capacity >= weights[index]){
        ans += values[index];
        capacity -= weights[index];
      } else {
        ans += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }
    System.out.println("Max value : " + ans);
  }
}
