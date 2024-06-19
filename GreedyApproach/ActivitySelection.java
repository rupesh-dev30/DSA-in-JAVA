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

import java.util.*;

public class ActivitySelection {
  public static void main(String[] args) {
    int[] start = {0,1,3,5,8,5};       //{10,12,20} {1,3,0,5,8,5}
    int[] end = {6,2,4,9,9,7};         //{20,25,30} {2,4,6,7,9,9}

    //sort on the basis of end time (here already sorted)
    int activities[][] = new int[start.length][3];
    //first col : index 
    //second col : start
    //third col : end

    for(int i=0; i<start.length; i++){
      activities[i][0] = i;
      activities[i][1] = start[i];
      activities[i][2] = end[i];
    }

    //lambda function -> short form
    //Comparator is an interface for sorting Java Objects
    //o[2] means : sorting on the basis of column 2
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    maxAct = 1;
    ans.add(activities[0][0]);
    int lastEnd = activities[0][2];

    for(int i=1; i<end.length; i++){
      if(activities[i][1] >= lastEnd){
        maxAct++;
        ans.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }
    System.out.println("Maximum activity: " + maxAct);
    for(int i=0; i<ans.size(); i++){
      System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();
  }
}
