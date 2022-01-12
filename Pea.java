/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 9: Abstract Class Assignment
 * Date: 04.11.2021
 */


public class Pea extends Vegetable
{
   private double calories;
   public Pea(String name, String color,double calories) {
       super(name, color);
       this.calories=calories;
   }
   public double getCalories()
   {
       return calories;
   }
   public void setCalories(double calories)
   {
       this.calories = calories;
   }
   //Override bestPrepared method of the Vegetable abstract class
   public String bestPrepared()
   {
       return "Mexican style";
   }
   
   public String toString() {
	   return ("Class Name: Pea\nVegetable Name: " + name + "\nColor: " + color + "\nCalories: " + calories + "\nBest Prepared: " + bestPrepared());
   }
}
