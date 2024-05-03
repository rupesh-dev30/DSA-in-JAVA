public class RainWaterTapping {
  public static int trappedRainWater(int height[]){
    int size = height.length;
    //Calculate Left max boundary
    int leftMax[] = new int[size];
    leftMax[0] = height[0];
    for(int i=1 ; i<size ; i++){
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }

    //Calculate Right max boundary
    int rightMax[] = new int[size];
    rightMax[size-1] = height[size-1];
    for(int i=size-2 ; i>=0 ; i--){
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    for(int i=0 ; i<size ; i++){
      //Water level = min(Left max boundary , Right max boundary)
      int waterLevel = Math.min(leftMax[i],rightMax[i]);

      //trapped water = water level - height of current boundary
      trappedWater += waterLevel - height[i];
    }
    return trappedWater;
  }
  public static void main(Strings[] args) {
    int height[] = {4,2,0,6,3,2,5};
    int result = trappedRainWater(height);
    System.out.println(result);
  }
}
