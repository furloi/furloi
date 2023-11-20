// This class simulates the random walk of a drunkard.

import java.util.Random;
public class DrunkardWalk{
 
  private int street;
  private int ave;
  public int startStreet;
  public int startAve;
 
  // constructs a drunkard
  public Drunkard (int anAve , int aStreet){
    startStreet=aStreet;
    street=startStreet;
    startAve=anAve;
    ave=startAve;
 }

  
    // moves the drunkard forward one block in a random direction
  public void step(){
      Random d = new Random();
      int direction = d.nextInt(4);
      if (direction == 0)
          street++;
      else if (direction == 1) 
          street--;
      else if (direction==2)
          ave++;
      else
          ave--;
  }

  
    //moves the drunkard forward a set number of steps
  public void fastForward(int steps){
      int count = 1;
      while (count <= steps){
          step();
          count++;
      }
  }

  
    // returns how far the drunkard made it from their starting point
  public int howFar(){
      int distance = Math.abs(street - startStreet) + Math.abs(ave-startAve);
      return distance;
  }

    // returns the drunkard's coordinates
  public String getLocation(){
      String location = street + " , " + ave;
      return location;
  }

}
