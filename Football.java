	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */	

	public class Football extends Athlete{
	
	private String specialty;
	
	//Constructor method
	public Football(String name, int age, String team, String position, String specialty){
		super(name, age, team, position);
		this.specialty = specialty;
	}
	
	@Override
	public String toString() {
		String extending = super.toString();
			return extending + "Specialty: " + specialty + "\n";
	}
	//Getter methods
	public String getSpecialty(){
		return specialty;
	}
	//Setter methods
	public void setSpecialty(String specialty){
		this.specialty = specialty;
	}
	
	public void doThis(){
		System.out.println(this.getName() + " tackles somebody.");
	}
	
	}