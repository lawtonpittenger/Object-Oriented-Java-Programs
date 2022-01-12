/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 10: Java Interface Assignment
 * Date: 04.11.2021
 */



public class Circle extends AbstractShape implements Shape, Area, Perimeter {

	private double radius;
	private final static double PI = 3.14;

		//Constructor method
		public Circle(double radius) {
			super();
			this.radius = radius;
		}



		//Getters and setters
		public double getRadius() {
			return radius;
		}


		public void setRadius(double radius) {
			this.radius = radius;
		}


		@Override
		public double getPerimeter() {
			return 2 * PI * radius;
		}

		@Override

		public double getArea() {
			return PI * radius * radius;
		}

		@Override
		public void printShape() {
			System.out.println("The shape is CIRCLE");
		}

		@Override
		public void displayDetails() {
			System.out.format("The area and perimeter of circle with radius %.2f are %.2f and %.2f, respectively", radius, getArea(), getPerimeter());
		}
	}


