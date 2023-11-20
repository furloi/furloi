/*****************************************
 * Test class for Nim game
 ****************************************/ 
import java.util.Scanner;

public class Nim{
    public static void main(String[] args){
        
        System.out.println("Let's Play Nim!");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a difficulty level:  1 or 2?);
        int level = input.nextInt();
        while (level != 1 && level != 2){
          System.out.println("That wasnt an option... please pick 1 or 2");
          int level = input.nextInt();
          
        Game g = new Game(level);
        g.play();
        
        System.out.println("that was fun ... Thanks for playing!");
