package jets;

import java.util.Scanner;

public class JetsDriver {

	public static void main(String[] args) {
		runJets();
	}
	
	public static void runJets() {
		Scanner kb = new Scanner(System.in);
		int input;
		
		Pilot hanSolo = new Pilot("Han Solo", 50, 60);
		Pilot palpatine = new Pilot("Palpatine", 90, 110);
		Pilot admiralAkbar = new Pilot("Admiral Akbar", 67, 80);
		Pilot wedge = new Pilot("Wedge", 25, 34);
		Pilot stormTrooper = new Pilot("Storm Trooper", 30, 30);
		
		Pilot[] barracks = new Pilot[30];
		
		barracks[0] = hanSolo;
		barracks[1] = palpatine;
		barracks[2] = admiralAkbar;
		barracks[3] = wedge;
		barracks[4] = stormTrooper;
		
		Jet xWing = new Jet("X-Wing", 500000, 1000000, 767.269, randPilot(barracks));
		Jet yWing = new Jet("Y-Wing", 400000, 1500000, 555.99, randPilot(barracks));
		Jet tieFighter = new Jet("TIE Fighter", 750000, 250000, 1001, randPilot(barracks));
		Jet starDestroyer = new Jet("Star Destroyer", 2000000, 5000000, 357.85, randPilot(barracks));
		Jet milleniumFalcon = new Jet("Milennium Falcon", 300000, 1000000, 1534.438, randPilot(barracks));
		
		Jet[] jetArr = new Jet[30];
		
		jetArr[0] = xWing;
		jetArr[1] = yWing;
		jetArr[2] = tieFighter;
		jetArr[3] = starDestroyer;
		jetArr[4] = milleniumFalcon;
		
		do {
			System.out.println("Please select an option:");
			System.out.println("1) List fleet");
			System.out.println("2) View fastest jet");
			System.out.println("3) View jet with longest range");
			System.out.println("4) Add a jet to fleet");
			System.out.println("5) Hire a new Pilot");
			System.out.println("6) View pilots");
			System.out.println("7) Quit");
			
			input = kb.nextInt();
			
			if (input == 1) {
				for (Jet jet : jetArr) {
					if (jet == null) {
					}
					else {
						System.out.println(jet);
					}
					
				}
				System.out.println();
			}
			else if (input == 2) {
				Jet fastest = jetArr[0];
				for (Jet jet : jetArr) {
					if (jet == null) {
					}
					else if (jet.getSpeed() > fastest.getSpeed()) {
						fastest = jet;
					}
				}
				System.out.println("Fastest jet: " + fastest);
				System.out.println();
			}
			else if (input == 3) {
				Jet longest = jetArr[0];
				for (Jet jet : jetArr) {
					if (jet == null) {
					}
					else if ( jet.getRange() > longest.getRange() ) {
						longest = jet;
					}
				}
				System.out.println("Jet with longest range: " + longest);
				System.out.println();
			}
			else if (input == 4) {
				String model;
				double range, speed, price;
				System.out.print("Please enter the new jet's model: ");
				model = kb.next();
				System.out.print("\nPlease enter " + model + "'s price: ");
				price = kb.nextDouble();
				System.out.print("\nPlease enter " + model + "'s range: ");
				range = kb.nextDouble();
				System.out.print("\nPlease enter " + model + "'s speed in MPH: ");
				speed = kb.nextDouble();
				Jet userJet = new Jet(model, price, range, speed, randPilot(barracks));
				
				outer:
				for (int i = 0; i < jetArr.length; i++) {
					if (jetArr[i] == null) {
						jetArr[i] = userJet;
						break outer;
					}
				}
				System.out.println("New fleet printout:");
				System.out.println();
				for (Jet jet : jetArr) {
					if (jet == null) {
					}
					else {
					System.out.println(jet);
					}
				}
				System.out.println();
			}
			else if (input == 5) {
				String name;
				int exp, age;
				System.out.print("Please enter the new pilot's name: ");
				name = kb.next();
				System.out.print("\nPlease enter " + name + "'s age: ");
				age = kb.nextInt();
				System.out.print("\nPlease enter " + name + "'s experience: ");
				exp = kb.nextInt();
				Pilot userPilot = new Pilot(name, exp, age);
				
				outer:
					for (int i = 0; i < barracks.length; i++) {
						if (barracks[i] == null) {
							barracks[i] = userPilot;
							break outer;
						}
					}
					System.out.println("New fleet printout:");
					System.out.println();
					for (Pilot pilot : barracks) {
						if (pilot == null) {
						}
						else {
						System.out.println(pilot);
						}
					}
				System.out.println();
			}
			else if (input == 6) {
				for (Pilot pilot : barracks) {
					if (pilot != null)
					System.out.println(pilot);
				}
				System.out.println();
			}
			else if (input > 7) {
				System.out.println("Please select a number from 1 to 5");
				System.out.println();
			}
			
		} while (input != 7);
		System.out.println("\nYou have succesfully quit the program.");
	
		kb.close();
		
	}
	
	public static Pilot randPilot(Pilot[] barracks) {
		int j = 0;
		for (int i = 0; i < barracks.length; i++) {
			if (barracks[i] != null) {
				j = i;
			}
			else if (barracks[i] == null) {
				j = i - 1;
				break;
			}
		}
		
		int randomPilot = (int)(Math.random()*j);
		return barracks[randomPilot];
	}

}
