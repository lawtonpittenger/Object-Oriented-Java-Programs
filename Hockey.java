	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */		

	public class Hockey extends Athlete{
		private String stickBrand;
	
	@Override
	public String toString() {
		String extending = super.toString();
			return extending + "Stick Brand: " + stickBrand + "\n";
	}
	
	//Constructor method
	public Hockey(String name, int age, String team, String position, String stickBrand) {
		super(name, age, team, position);
		this.stickBrand = stickBrand;
	}
	
	//Getter methods
	public String getStickBrand() {
		return stickBrand;
	}
	
	//Setter methods
	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}
	
	public void doThis() {
		System.out.println(this.getName() + " sits in the penalty box.");
	}
	}