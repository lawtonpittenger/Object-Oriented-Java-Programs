/*
	 	* 		Program Assignment: HW 3 - Beer Assignment
	 	* 		Program Author: Lawton Pittenger
	 	* 		Date: 02.4.2021
	 	* 		Program Purpose: To demonstrate the ability to write and run a simple program, perform mathematical calculations in Java, and the ability to handle IO from/to user. 
	 	* 		Files included in project: beerCalculator.java, and my design tool.
	 	* 		Created on: Windows 10 OS
*/
	
	//Import necessary scanner library.
	import java.util.Scanner;
	
	
	//Create a class to hold all of the code.
	public class beerCalculator {
		
		//Main method where we will be writing all of the actual code since this is a short program.
		public static void main(String[] args) {
			
			//Declare a new Scanner object.
			Scanner userInput = new Scanner(System.in);
			
			
			//Begin prompting the user to enter their input via print statements.
			System.out.println("On average, how many beers will you consume each day?\n");
			//Store the users response in a variable.
			double numBeers = userInput.nextDouble();
			
			/* Validate users input before proceeding with rest of program.
			I chose a while loop to account for users entering multiple negative numbers in a row	*/
			while (numBeers < 0.0) {
				System.out.println("Please enter a valid non-negative real number");
				System.out.println("On average, how many beers will you consume each day?\n");
				numBeers = userInput.nextDouble();
			}
			
			
			//Collect the avg cost spent on each can of beer from the user.
			System.out.println("On average, how much will you pay for each can of beer?");
			double beerCost = userInput.nextDouble();
			
			//Again, we must always validate user input (same procedure as above)
			while (beerCost < 0) {
				System.out.println("Please enter a valid non-negative real number");
				System.out.println("On average, how much will you pay for each can of beer?");
				beerCost = userInput.nextDouble();
			}
			
			
			//Perform calculations and print the results to the user (Can be done all same line)
			System.out.printf("That is approximately %.2f beers in one year.\n", numBeers * 365.0);
			System.out.printf("In one year, you will consume approximately %.2f calories from beer alone.\n", (numBeers * 365) * 150);
			System.out.printf("Without diet or exercise to counter these calories, you can expect to gain %.2f pounds from drinking that much beer this year.", (numBeers * 15));
			
			
				

			
			
			
			

		}

	}
