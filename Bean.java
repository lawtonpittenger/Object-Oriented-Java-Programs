/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 9: Abstract Class Assignment
 * Date: 04.11.2021
 */


public class Bean extends Vegetable
{
   private double calories;
   
   public Bean(String name, String color,double calories) {
       super(name, color);
       this.calories=calories;
   }
   
   //Override bestPrepared method of the Vegetables abstract class
   public String bestPrepared()
   {
       return "Cuban style";
   }
   public double getCalories()
   {
       return calories;
   }
   public void setCalories(double calories)
   {
       this.calories = calories;
   }
   public String toString() {
	   return ("Class Name: Bean\nVegetable Name: " + name + "\nColor: " + color + "\nCalories: " + calories + "\nBest Prepared: " + bestPrepared());
   }
}