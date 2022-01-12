/*
 * Program Author: Lawton Pittenger
 * Date: 02.18.2021
 * Purpose of Assignment: 
 * Student will demonstrate the ability to write and call methods.
 * Student will demonstrate the ability to pass values to and from methods.
 * Student will demonstrate the ability to catch exceptions.
 * Student will demonstrate the ability to create a text file.
 * Student will demonstrate the ability to validate input data.
 * 
 */
import java.io.*;
import java.util.Scanner;




//Class containing all functions / case statements. 
public class Menu {


	//Function that prints name entered by user 20 times. 
	static void printName(String name) {
		for(int i = 0; i < 20; i++) {
			System.out.println(i + 1 +  ". " + name);
		}
	}

	//Function that doubles the age entered by the user.
	static void doubleAge(int age) {
		int doubledAge = age * 2;
		System.out.println("Current Age: " + age +" \nDoubled Age: " + doubledAge);
	}

	//Function that determines whether or not the user is a teenager. 
	static void teenCheck(int age) {

		//Throw a new exception if the user enters an invalid age. (No one is over 120 years old or below 0)
		if (age > 120 || age < 0) throw new ArithmeticException("Please re-run program and enter a valid age.");

		//If statement that determines if the user is teenager or not. 
		if(age < 20 && age > 12 ) {
			System.out.println("Since you are " + age + " years old, you are a teenager");
		}
		else {
			System.out.println("Since you are " + age + " years old, you are NOT a teenager");
		}



	}


	//Method that prints the triangle based on number entered by the user. 
	public static void printTriangle(int N) throws FileNotFoundException {
		//Creates new file triangle.txt in specific directory on my PC. 
		//FOR GRADING PURPOSES: You will need to change the directory path to a valid path on your own PC. (Works on my PC because this is the correct path for my file system)
		PrintWriter file = new PrintWriter(new PrintWriter ("C:\\Users\\lawto\\eclipse-workspace\\Homework 4\\src\\triangle.txt"));
		for (int i = 0; i < 2 * N - 1; i++) {
			if (i % 2 == 0) {
				char x = 'X';
				for (int k = 0; k <= i; k++) {
					file.write(x);
					System.out.print("X ");
				}
				file.write('\n');
				System.out.println();  
			}}
		file.close();
	}


	static void welcomeMessage() {
		System.out.println("-------- Welcome to HW 4: Methods, IO, and Exceptions ----------\n");
		System.out.println("-------- Use the following menu to navigate this program -------\n");
		System.out.println("---------------------------- MENU ------------------------------\n");
		System.out.println("Option 1: Will echo your name back to you 20 times.\n");
		System.out.println("Option 2: Will double your age and display it to you.\n");
		System.out.println("Option 3: Will determine if you are a teenager or not.\n");
		System.out.println("Option 4: Create a triangle of X's with as many rows as you would like.\n");
		System.out.println("Option 5: Exit Program\n");
	}







	public static void main(String[] args) throws FileNotFoundException  {

		//Print welcome message to user
		welcomeMessage();
		System.out.println("Please enter your option number:");
		Scanner userInput = new Scanner (System.in);
		int menuCall = userInput.nextInt();

		//Ensure that user is entering a valid option number. 
		if (menuCall > 5 || menuCall < 1) {
			System.out.println("Please enter a valid option number.\n");
			userInput.nextLine();
			System.out.println("Please enter your option number: ");
			menuCall = userInput.nextInt();
		}

		switch(menuCall) {
		case 1 : 
			//Prompt user to enter their name.
			System.out.println("Enter your name");
			userInput.nextLine();
			String name = userInput.nextLine();
			//Pass name entered by user to the printName method.
			printName(name);
			break;

		case 2 : 
			//Prompt user to enter their age.
			System.out.println("Enter your age");
			int age = userInput.nextInt();
			//Pass age entered by user to the printName method.
			doubleAge(age);
			break;

		case 3 :
			//Prompt user to enter their age.
			System.out.println("Enter your age");
			age = userInput.nextInt();
			//Pass age entered by user to the teenCheck method.
			teenCheck(age);
			break;

		case 4:
			//Prompt user to enter number to create triangle. 
			System.out.println("Please enter a number between 3 and 50 to create a triangle with that amount of rows.");
			userInput.nextLine();
			int userChoice = userInput.nextInt();
			//Pass number entered by user to the printTriangle method.
			printTriangle(userChoice);
			break;

		case 5:
			//Exit program
			System.out.println("Exited Program");
			userInput.close();
			break;

		}
	}}

