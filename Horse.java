/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 8: Second Inheritance Assignment
 * Date: 04.1.2021
*/

	public class Horse extends Animal {

		public Horse(int legs, int speed, String food) {
			super(food, legs, speed, food);

}

		@Override 
		public String toString() {
			return "Animal: Horse\nNumber of Legs: " + legs + "\nSpeed: " + speed + "\nFood: " + food;
		}

		@Override
		public void run() {
			System.out.println("Horse is running");
		}
	}