	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */	

abstract public class Athlete extends Person{
	
	private String team, position;
	
	//Constructor method
	public Athlete(String name, int age, String team, String position) {
		super(name, age);
		this.setTeam(team);
		this.position = position;
	}
	
	//Override original toString
	@Override
	public String toString() {
		//Just add onto existing toString
		String extending = super.toString();
			return extending + "Team: " + team + "\n" + "Position: " + position + "\n";
	}
	
	//Getter methods
	public String getPosition() {
		return position;
	}
	public String getTeam() {
		return team;
	}
	//Setter methods
	public void setPosition(String position) {
		this.position = position;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	}