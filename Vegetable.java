/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 9: Abstract Class Assignment
 * Date: 04.11.2021
 */



// Vegetable abstract class, has a name and color
public abstract class Vegetable
{
    String name, color;
   
   //Constructor method
   public Vegetable(String name, String color)
   {
       this.name=name;
       this.color=color;
   }
   
   //Abstract method
   public abstract String bestPrepared();
   
   //Getters and Setters
   public String getName()
   {
       return name;
   }  
   public void setName(String name)
   {
       this.name = name;
   }
   public void setColor(String color)
   {
       this.color = color;
   }
   public String getColor()
   {
       return color;
   }
   
   public String toString() {
	   return "Class Name: Vegetable\nVegetable Name: " + name + "\nColor: " + color;
   }
   
}
