// A tester for the DrunkardWalk class

import java.util.Scanner;

public class DrunkardTester {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter the starting avenue: ");
	int avenue = input.nextInt();
	System.out.println("Please enter the starting street: ");
	int street = input.nextInt();
	
	// make the Drunkard
	Drunkard dad = new Drunkard(avenue,street);

	// have him move 100 intersections
	dad.fastForward(100);
	
	// get his current location
	String location = dad.getLocation();
	
	// get distance from start
	int distance = dad.howFar();

	System.out.println("Current location: " + location);
	System.out.println("Dad is " + distance + " blocks from where he started");

    }
}
