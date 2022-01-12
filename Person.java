/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 11: First Poly Assignment
 * Date: 04.11.2021
 */	
	
	
	abstract public class Person {
	
	private String name;
	private int age;
	
	
	@Override
	public String toString(){
		return "Name: " + name +"\n"+"Age: " + age +"\n";
	}
	
	//Constructor method
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//Setters methods
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
