/**A program called F2C that allows the user to convert from degrees Fahrenheit to degrees Celsius. 
 The program should prompt for a temperature in Fahrenheit and output a temperature in Celsius. 
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        Scanner Fahrenheit = new Scanner (System.in);
        System.out.print("What is the temperature in Fahrenheit?: ");
        int f = Fahrenheit.nextInt();
        int c = (f-32)*5/9;

        System.out.println("That is " + c + " degrees Celsius");        
    }   
    
}
