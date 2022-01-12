	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */		

	public class Golf extends Athlete{
		private String mainSponser;
	  
	public Golf(String name, int age, String team, String position, String mainSponser) {
		super(name, age, team, position);
		this.mainSponser = mainSponser;
	}
	
	//Getter methods
	public String getMainSponser() {
		return mainSponser;
	}
	
	//Setter methods
	public void setMainSponser(String mainSponser) {
		this.mainSponser = mainSponser;
	}
	
	public void doThis() {
		System.out.println(this.getName() +" made it in the hole.");
	}
	@Override
	public String toString() {
		String extending = super.toString();
			return extending + "Main Sponser: " + mainSponser + "\n";
	}
	}
