/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 8: Second Inheritance Assignment
 * Date: 04.1.2021
*/

	public class Animal {

		public int legs, speed;
		public String food, name;

	
		// animal constructor
		public Animal(String name, int legs, int speed, String food) {
			super();
			this.name = name;
			this.legs = legs;
			this.speed = speed;
			this.food = food;
		}
		
		public String toString() {
			return "Animal: " + name + "\nNumber of Legs: " + legs + "\nSpeed: " + speed + "\nFood: " + food;
		}

		public void run() {
			System.out.println("Animal is running");
		}

		public void content(int legs, int speed) {
			System.out.println("Legs for this animal: "+ legs +"\nSpeed of this animal is: "+ speed);
		}

		// Overloading content method
		public void content(int legs) {
			System.out.println("Number of legs: "+legs);
		}

		// Overloading content method
		public void content(int legs, int speed, String food) {
			System.out.println("Number of legs: "+legs+"Speed of this animal is: "+speed+ "Food type of this animal is: "+food);
		}
	}