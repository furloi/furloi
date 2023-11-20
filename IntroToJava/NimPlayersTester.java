import java.util.Scanner;

public class NimPlayersTester{
    public static void main(String[] args){
        NimHuman fred = new NimHuman();
        NimComputer jarvis = new NimComputer(1);
        Scanner input = new Scanner(System.in);

        fred.move(6);
        System.out.println(fred.getChoice());

        jarvis.move(10);
        System.out.println(jarvis.getChoice());

    }
}
        
