/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 8: Second Inheritance Assignment
 * Date: 04.1.2021
*/



	public class Test {

		public static void main(String[] args) {

			// creating Animal object
			Animal test = new Animal("Dog",4,25,"Kibble");

			// creating horse objects
			Horse horse1 = new Horse(4,66,"Hay");
			Horse horse2 = new Horse(4,77,"Hay");

			// creating horse object and referencing to animal
			Animal horse3 = new Horse(4,88,"Hay");
			
			// Print objects
			System.out.println(test);
			System.out.println("------------------------------");
			System.out.println(horse1);
			System.out.println("------------------------------");
			System.out.println(horse2);
			System.out.println("------------------------------");
			System.out.println(horse3);
			System.out.println("------------------------------");

			// Calling overloaded method "content"
			horse1.content(horse1.legs);
			System.out.println("------------------------------");
			horse1.content(horse1.legs,horse1.speed);
			System.out.println("------------------------------");

			// Calling overriding method "run"
			horse3.run();
		}

	}

