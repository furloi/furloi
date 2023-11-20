/**
* This is a tester class for the LeapYear class
*/

import java.util.Scanner;

public class LeapYearTester{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year_input = input.nextInt();

        // makes a year object
      
        Year theYear = new Year(year_input);

        // checks if it's a leap year

        if (theYear.isLeapYear())
            System.out.println(year_input + " is a leap year.");
        else
            System.out.println(year_input + " is not a leap year.");
    }
  
}
