/*
* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class LeapYear{
    
    // Instance variables include the conditions that determine 
    // whether a given year is a leap year

private int year;
final int START = 1582;
final int TEST1 = 400;
final int TEST2 = 100;
final int TEST3 = 4;
boolean isleapYear= false;


    // Constructs a year

    public LeapYear(int y){
       year = y;
       
    }

    // determines whether a year is a leap year and returns a true/false value
    
    public boolean isLeapYear(){
        if (year>START && year%TEST3 == 0 && (year%TEST1==0 || year%TEST2 !=0 ))
            isleapYear=true;
        else
         isleapYear=false;

         return leapYear;
        
    }

}    

