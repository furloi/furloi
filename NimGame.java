/*****************************************
 * A template for a Nim game
 ****************************************/ 

import java.util.Random;
import java.util.Scanner;
public class NimGame{
    
    private int marbles;
    private int flip;
    private int mode;
    private NimHuman humanPlayer;
    private NimComputer computerPlayer;
    private Scanner player;
    
    public Game(int difficulty){
        mode = difficulty;
        
    }

     
    public void play(){
        NimComputer computerPlayer = new NimComputer(mode); 
        NimHuman humanPlayer = new NimHuman();
        Scanner player = new Scanner(System.in);
      
        //Establishes how many marbles we start with (10-100).
        Random startingMarbles = new Random();
        marbles = startingMarbles.nextInt(90)+11;


        //Decides who goes first
        Random coinFlip = new Random();
        flip = coinFlip.nextInt(2);

       // Game if human goes first.
        if (flip==1){
            System.out.println("humans first...");
            while (marbles > 0){
                System.out.println(marbles + " marbles left");
                System.out.print("how many marbles will you take?");
                humanPlayer.move(player.nextInt());
                while (humanPlayer.getChoice() > marbles/2){
                    System.out.println("that is an illegal move, you may pick at most " + marbles/2 + "Marbles");
                    System.out.println("how many marbles will you take?");
                    humanPlayer.move(player.nextInt());
                marbles = marbles - humanPlayer.getChoice();
                System.out.println(marbles + " marbles left");
                if (marbles == 0){
                    System.out.println("You lose!");
                    break;
                }
                System.out.println("my turn!");
                computerPlayer.move(marbles);
                System.out.println("im taking " + computerPlayer.getChoice() + " marbles");
                marbles = marbles - computerPlayer.getChoice();
                if (marbles == 0){
                    System.out.println("you beat a computer... I guess youre pretty smart");
                    break;
                }
            }
        }


        else{
            System.out.println("I'll make the first move.");
            System.out.println("We have " + marbles + " marbles");
             while (marbles > 0){
                computerPlayer.move(marbles);
                System.out.println("im taking " + computerPlayer.getChoice() + " marbles");
                marbles=marbles - computerPlayer.getChoice();
                System.out.println("that leaves " + marbles + " marbles left");
                if (marbles == 0){
                    System.out.println("you beat a computer... I guess youre pretty smart");
                    break;
                }
                System.out.print("how many marbles will you take?");
                humanPlayer.move(player.nextInt());
                while (humanPlayer.getChoice() > marbles/2){
                    System.out.println("that is an illegal move, you may pick at most " + marbles/2 + "Marbles");
                    System.out.println("how many marbles will you take?");
                    humanPlayer.move(player.nextInt());
                marbles = marbles - humanPlayer.getChoice();
                System.out.println("that leaves " + marbles + " marbles left");
                 if (marbles == 0){
                    System.out.println("You lose!");
                    break;
                }
                System.out.println("my turn!");
             }
        }
  
    }

}
