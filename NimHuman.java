/*****************************************
 * A template for a Human Nim player
 ****************************************/ 

public class NimHuman{
   
    private int choice;
    private Scanner input;
    
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
