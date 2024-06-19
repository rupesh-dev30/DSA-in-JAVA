/* 
    Problem: 

    You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.

    start = [10,12,20]
    end = [20,25,30]

    ans: 2 (A0 & A2)


    Other question solve using same logic: 
      Disjoint Set, 
      Max meeting in a room


    Method to solve this question:
    
    1) sort on the basis of end time
    2) A0 must select
        end time A0(first Activity after sorting) -> non overlapping start time must be >= last choosen end time
        start >= end

        cnt++;

*/

import java.util.ArrayList;

public class ActivitySelection {
  public static void main(String[] args) {
    int[] start = {1,3,0,5,8,5};       //{10,12,20}    
    int[] end = {2,4,6,7,9,9};         //{20,25,30}

    //sort on the basis of end time (here already sorted)

    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    maxAct = 1;
    ans.add(0);
    int lastEnd = end[0];

    for(int i=1; i<end.length; i++){
      if(start[i] >= lastEnd){
        maxAct++;
        ans.add(i);
        lastEnd = end[i];
      }
    }
    System.out.println("Maximum activity: " + maxAct);
    for(int i=0; i<ans.size(); i++){
      System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();
  }
}
