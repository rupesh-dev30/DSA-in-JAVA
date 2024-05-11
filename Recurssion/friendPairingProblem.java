/*
  Friend Pairing Problem:

  Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.


  https://leetcode.com/discuss/general-discussion/1349122/friends-pairing-problem

*/

public class friendPairingProblem {
  public static int noOfWay(int n){
    if(n==0 || n==1 || n==2){
      return n;
    }
    return noOfWay(n-1) + (n-1) * noOfWay(n-2);
  }
  public static void main(String[] args) {
    System.out.println(noOfWay(10));
  }
}
