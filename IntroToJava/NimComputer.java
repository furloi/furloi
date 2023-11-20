/*****************************************
 * A template for a computer Nim player
 ****************************************/ 

import java.util.Random;

public class NimComputer{
    
    private int mode;
    private int choice;
    private int marblesLeft;

  // creates a computer player that will play on easy(1) or hard(2) mode
    public NimComputer(int m){
        mode = m;
        choice = -1;
    }
    

    public void move(int marblesLeft){
        this.marblesLeft = marblesLeft;
         int marbles = marblesLeft/2;

        //On easy mode (1) the computer will choose to take a random number of marbles 
        //less than or equal to half of the remaining marbles.
      
        if (mode == 1){
          Random pick = new Random();
          if (marbles == 1 || marblesLeft == 1){
            choice=1;
            }
          else {
          choice = pick.nextInt(marbles)+1; 
          }
        }
          // on hard mode(2), the computer will try to pick an number that leaves 
          // 63,31,15,7,or 3 marbles remaining, which guarantees the computer a win.
          
        else if (mode == 2){
            if (marblesLeft == 63 || marblesLeft == 31 || marblesLeft == 15 || marblesLeft == 7 || marblesLeft == 3){
                 Random pick = new Random();
                 choice = pick.nextInt(marbles); 
            }
            else if (marblesLeft>31){
                choice = marblesLeft-31;
            }
            else if (marblesLeft>15){
                choice = marblesLeft-15;
            }
            else if (marblesLeft>7){
                choice = marblesLeft-7;
            }
            else if (marblesLeft>3){
                choice = marblesLeft-3;
            }
            else{
                choice=1;
            }


        }
        
    }
    
    // returns the Computer's move.
    public int getChoice(){
        return choice;
    }
    
    
}
