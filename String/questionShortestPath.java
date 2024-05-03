//Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.

public class questionShortestPath {
  public static float shortestPath(String str){
    int x = 0 , y = 0;
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i) == 'N'){
        y++;
      }else if(str.charAt(i) == 'S'){
        y--;
      }else if(str.charAt(i) == 'E'){
        x++;
      }else{
        x--;
      }
    }
    float distance = (float) Math.sqrt((x*x) + (y*y));
    return distance;
  }
  public static void main(String[] args) {
    String str = "WNEENESENNN";
    float result = shortestPath(str);
    System.out.println(result);
  }
}