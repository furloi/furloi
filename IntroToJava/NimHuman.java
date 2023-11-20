/*****************************************
 * A template for a Human Nim player
 ****************************************/ 

public class NimHuman{
   
    private int choice;
    
    public NimHuman(){
        choice = -1;
    }
    
    public void move(int marbles){
        choice = marbles;
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
