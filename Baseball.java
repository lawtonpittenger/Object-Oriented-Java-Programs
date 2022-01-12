	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */	


public class Baseball extends Athlete{
	  
	private String battingPosition;
	
	//Constructor method
	public Baseball(String name, int age, String team, String position, String battingPosition) {
		super(name, age, team, position);
	this.setBattingPosition(battingPosition);
	}
	//Getter methods
	public String getBattingPosition() {
		return battingPosition;
	}
	//Setter methods
	public void setBattingPosition(String battingPosition) {
		this.battingPosition = battingPosition;
	}
	
	public void doThis() {
		System.out.println(this.getName() +" hits the ball.");
		// displays that player hit something.
	}
	@Override
	public String toString() {
		//Add onto existing toString
		String extending = super.toString();
			return extending + "Batting Position: " + battingPosition + "\n";
	}
	
	}
