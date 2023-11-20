/**  Asks a user for a number of hours, days, weeks, and years. 
 *It then computes the equivalent number of minutes (ignoring leap years). 
 */

import java.util.Scanner;

public class Convert2Minutes {
    
    public static final void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
      
      // prompts user for input.
        System.out.print("Years: ");
        int years = scan.nextInt();

        System.out.print("Weeks: ");
        int weeks = scan.nextInt();

        System.out.print("Days: ");
        int days = scan.nextInt();

        System.out.print("Hours: "); 
        int hours = scan.nextInt();

      //converts to minutes.
        int a = 52 * years + weeks;
        int b = 7 * a + days;
        int c = 24 * b + hours;
        int min = 60 * c;

        System.out.println( "Wow! That is " + min + " minutes!");        
        
    }
    
    
}
