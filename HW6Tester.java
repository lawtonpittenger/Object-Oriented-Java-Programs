
public class HW6Tester {

	
		public static void main(String[] args) {

		//Creating three different person objects using various methods
		Name name1 = new Name("UsAIn", "bOLt");
		Person person1 = new Person(name1, 'M', 42, 90000.00);
		Person person2 = new Person(new Name("Jack", "Skip", "Joe"), 'M', 29, 43000.00);
		Person person3=new Person("Yanet", "Beans", 'F', 28, 19000.00);

		//Print to console
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		//Testing the getters + setters
		System.out.println("Setting gender to 'X' for: "+person3.getName());
		person3.setGender('X');
		//Shouldn't change because it is not valid gender. 
		System.out.println("Result: "+person3);
		System.out.println("Setting age equal to 12 for: "+person3.getName());
		person3.setAge(12);
		//Should change because this is a valid request. 
		System.out.println("Result: "+person3);
		}}
