import java.io.IOException;

public class JadMain {

	public static void main(String[] args) {
	//	try {
		JadCredits credits = new JadCredits();

		java.util.Scanner scan = new java.util.Scanner(System.in);

		boolean back = true;
		String sel1, sel3;
		int sel2;
		int selDial;

		JadPlayer p1 = new JadPlayer();
		JadPlayer p2 = new JadPlayer();
		JadPlayer p3 = new JadPlayer();
		JadPlayer p4 = new JadPlayer();
		
		while (true) {
			if (back) {
				System.out.println(	"-----------------------------\n" 
									+ " Welcome to Java and Dragons \n"
									+ "-----------------------------\n" 
									+ "(s) Start\n" + "(o) Options\n" + "(c) Credits\n"
									+ "(e) Exit");
				back = false;
			}
			
			System.out.flush();

			switch (scan.nextLine().charAt(0)) {
			case 's': {

				System.out.println("How many players are going to participate? [1-4]");

				sel1 = scan.nextLine();
				while (!(sel1.equals("1") || sel1.equals("2") || sel1.equals("3") || sel1.equals("4"))) {
					System.out.println("Please choose a whole number from 1 to 4 to select!");
					sel1 = scan.nextLine();
				}
				sel2 = Integer.parseInt(sel1);
				for (int i = 1; i <= sel2; i++) {
					System.out.println("What's your name, player " + i + "?");
					sel1 = scan.nextLine();
					while (sel1.length() > 12 || sel1.length() < 3) {
						System.out.println("Please choose a name with a length from 3 to 12 characters!");
						sel1 = scan.nextLine();
					}

					System.out.println(		"-----------------------------\n" 
											+ " Please choose a class, " + sel1 + "!\n"
											+ "-----------------------------\n" 
											+ "(0) Warrior\n" 
											+ "(1) Archer\n" 
											+ "(2) Wizard\n"
											+ "(3) Rogue");
					sel3 = scan.nextLine();
					while (!(sel3.equals("0") || sel3.equals("1") || sel3.equals("2") || sel3.equals("3"))) {
						System.out.println("Please choose a whole number from 0 to 3 to select!");
						sel3 = scan.nextLine();
					}
					switch (i) {
					case 1: {
						p1.JadPlayer(sel1, Integer.parseInt(sel3));
						break;
					}
					case 2: {
						p2.JadPlayer(sel1, Integer.parseInt(sel3));
						break;
					}
					case 3: {
						p3.JadPlayer(sel1, Integer.parseInt(sel3));
						break;
					}
					case 4: {
						p4.JadPlayer(sel1, Integer.parseInt(sel3));
						break;
					}
					}
				}

				System.out.println("Is this correct? (y/n)\n" + " -Playername- | -Class- ");

				switch (sel2) {
				case 4: {
					sel1 = "             ".substring(p4.name.length());
					System.out.printf(" %s" + sel1 + "| %s \n", p4.name, p4.toS(0));
				}
				case 3: {
					sel1 = "             ".substring(p3.name.length());
					System.out.printf(" %s" + sel1 + "| %s \n", p3.name, p3.toS(0));
				}
				case 2: {
					sel1 = "             ".substring(p2.name.length());
					System.out.printf(" %s" + sel1 + "| %s \n", p2.name, p2.toS(0));
				}
				}
				sel1 = "             ".substring(p1.name.length());
				System.out.printf(" %s" + sel1 + "| %s \n", p1.name, p1.toS(0));

				sel1 = scan.nextLine();
				while (!(sel1.equals("y") || sel1.equals("n"))) {
					System.out.println("Please type (y) for yes, or (n) for no");
					sel1 = scan.nextLine();
				}
				if (sel1.equals("n")) {
					break;
				} else {
					System.out.println("Starting adventure...");
					System.out.println("First you meet your first merchant. He gives you an axe");
					
					switch(sel2) {
					case 4: {
						System.out.printf("Merchant: What is your mission in this forest %s %s %s %s? \n", p1.name, p2.name, p3.name, p4.name);
						System.out.println("\t (1) We are going to see, what life is about");
						System.out.println("\t (2) We want to start an adventure");
						break;
					}
					case 3: {
						System.out.printf("Merchant: What is your mission in this forest %s %s %s? \n", p1.name, p2.name, p3.name);
						System.out.println("\t (1) We are going to see, what life is about");
						System.out.println("\t (2) We want to start an adventure");
						break;
						
					}
					case 2: {
						System.out.printf("Merchant: What is your mission in this forest %s %s? \n", p1.name, p2.name);
						System.out.println("\t (1) We are going to see, what life is about");
						System.out.println("\t (2) We want to start an adventure");
						break;
						
					}
					case 1: {
						System.out.printf("Merchant: What is your mission in this forest %s? \n", p1.name);
						System.out.println("\t (1) I am going to see, what life is about.");
						System.out.println("\t (2) I want to start an adventure.");
						System.out.println("\t (3) I want to explore the forest.");
						break;
					}
					}

				}

				sel1 = scan.nextLine();
				while (!(Integer.parseInt(sel1) == 1|| Integer.parseInt(sel1) == 2 || Integer.parseInt(sel1) == 3)) {
					System.out.println("Please select the number of what you want to say!");
					sel1 = scan.nextLine();
				}
				selDial = Integer.parseInt(sel1);

				switch (selDial) {
				case 1: {
					System.out.println("%s are going to see, what life is about. \n");
					break;
				}
				case 2: {
					System.out.println("%s want to start an adventure.\n");
					break;
				}
				case 3: {
					System.out.println("I want to explore the forest. \n ");
					break;
				}
				}
				System.out.println(JadDialog.DialogTest1.FirstResponse(selDial)); // says what the merchant answeres
				JadMap.drawMap();
	//			throw new ArrayIndexOutOfBoundsException();
				continue;
				
			}
			case 'o': {
				System.out.println("Work in Progress =)\n" + "(any letter) Back");
				scan.nextLine();
				back = true;
				continue;
			}
			case 'c': {
				
				credits.drawJavaToAscII(); // print JAVA with E-Letters
				credits.drawAndToAscII(); // print AND with P-Letters
				credits.drawDragonsToascII(); // print DRAGONS with R-Letters
				credits.printCredits(); //print the credits
				

				System.out.println("Press any key to get back");
				scan.nextLine();
				back = true;
				break;
			}
			case 'e': {
				scan.close();
				System.exit(0);

			}

			default: {
				continue;
			}

			}
		}
//		}catch (ArrayIndexOutOfBoundsException exp) {
//			System.out.println("\n \n Here is the End of this adventure. \nWe are sorry, but we are working for further adventures!");
//		
//		}catch (Exception exp) {
//			System.out.println("Something went wrong! \n Please restart the Game");
//		}
	}
	

}
