	/*
	 * Program Author: Lawton Pittenger
	 * Assignment: HW 11: First Poly Assignment
	 * Date: 04.11.2021
	 */		

	public class HW11Tester {
	
	public static void main(String[] args){
	
	Baseball Walter = new Baseball("Walter White", 38, "Yankees", "Short-stop", "Right handed");
	System.out.print(Walter);
	Walter.doThis();
	System.out.println("-------------------------");
	  
	Football Jesse = new Football("Jesse Pinkman", 25, "Steelers", "Wide Receiver", "Offense");
	System.out.print(Jesse);
	Jesse.doThis();
	System.out.println("-------------------------");
	  
	Hockey Wayne =new Hockey("Wayne Gretzkey", 29, "Canada", "Defence", "Supreme");
	System.out.print(Wayne);
	Wayne.doThis();
	System.out.println("-------------------------");
	  
	Golf Tiger = new Golf("Tiger Woods", 38, "PGA", "Golfer", "National Golf Association");
	System.out.print(Tiger);
	Tiger.doThis();
	System.out.println("-------------------------");
	  
	Baseball Babe = new Baseball("Babe Ruth", 40, "Redsox", "Pitcher", "Right handed");
	System.out.print(Babe);
	Babe.doThis();
	System.out.println("-------------------------");
	  
	Football Cam = new Football("Cam Newton", 30, "Panthers", "Quarterback", "Offense");
	System.out.print(Cam);
	Cam.doThis();
	System.out.println("-------------------------");
	  
	Hockey Will = new Hockey("Will Ferrell", 34, "Penguins", "Defence", "Prestige Worldwide");
	System.out.print(Will);
	Will.doThis();
	System.out.println("-------------------------");
	  
	Golf Jack = new Golf("Jack Johnson", 46, "PGA", "Golfer", "Miller Lite");
	System.out.print(Jack);
	Jack.doThis();
	System.out.println("-------------------------");
	  
	}
	
	}