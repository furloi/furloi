/** A program that directs a cashier how to give change. 
 * The program has two inputs: the amount due and the amount received form the customer.
 * Displays the dollars, quarters, dimes, nickels, and pennies that the customer should receive in return. 
 * In order to avoid roundoff errors, the program user should supply both amounts in pennies (for example 274 instead of 2.74).
 */
import java.util.Scanner;

public class MakeChange {
    
    public static final void main(String[] args) {
        Scanner AmountOwed = new Scanner (System.in);
        System.out.print("How much do they owe you (in cents)?  ");
        int o = AmountOwed.nextInt();

        Scanner AmountGiven = new Scanner (System.in);
        System.out.print ( "How much did they give you (in cents)? ");
        int g = AmountGiven.nextInt();

        int C = g - o ;

        int d = C / 100;
        int D = C % 100;

        int q = D / 25;
        int Q = D % 25;

        int f = Q / 10;
        int F = Q % 10;

        int n = F / 5;
        int p = F % 5;

        System.out.println ("give them back");
        System.out.println(d +" dollars");
        System.out.println(q + " quarters");
        System.out.println(f + " dimes");
        System.out.println(n + " nickels");
        System.out.println(p + " pennies");   
        
    }
    
    
}
