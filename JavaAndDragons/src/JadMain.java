public class JadMain {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		boolean back = true;
		String sel1, sel3;
		int sel2;
		
		
		JadPlayer p1 = new JadPlayer();
		JadPlayer p2 = new JadPlayer();
		JadPlayer p3 = new JadPlayer();
		JadPlayer p4 = new JadPlayer();
		
		while(true){
			if (back){
				System.out.println("-----------------------------\n"
								 + " Welcome to Java and Dragons \n"
							 	 + "-----------------------------\n"
							 	 + "(s) Start\n"
							 	 + "(o) Options\n"
							 	 + "(c) Credits\n"
							 	 + "(e) Exit");
			back = false;
			}
			
			
			switch(scan.nextLine().charAt(0)){
			case 's':{
				
				System.out.println("How many players are going to participate? [1-4]");
				
				sel1 = scan.nextLine();
				while(!(sel1.equals("1")||sel1.equals("2")||sel1.equals("3")||sel1.equals("4"))){
					System.out.println("Please choose a whole number from 1 to 4 to select!");
					sel1 = scan.nextLine();
				}
				sel2 = Integer.parseInt(sel1);
				for (int i = 1; i<=sel2; i++){
					System.out.println("What's your name, player "+i+"?");
					sel1 = scan.nextLine();
					while(sel1.length()>12||sel1.length()<3){
						System.out.println("Please choose a name with a length from 3 to 12 characters!");
						sel1 = scan.nextLine();
					}
					
					System.out.println("-----------------------------\n"
									 + " Please choose a class, "+sel1+"!\n"
									 + "-----------------------------\n"
									 + "(0) Warrior\n"
									 + "(1) Archer\n"
									 + "(2) Wizard\n"
									 + "(3) Rogue");
					sel3 = scan.nextLine();
					while(!(sel3.equals("0")||sel3.equals("1")||sel3.equals("2")||sel3.equals("3"))){
					System.out.println("Please choose a whole number from 0 to 3 to select!");
					sel3 = scan.nextLine();
					}
					switch(i){
					case 1:{p1.JadPlayer(sel1,Integer.parseInt(sel3));break;}
					case 2:{p2.JadPlayer(sel1,Integer.parseInt(sel3));break;}
					case 3:{p3.JadPlayer(sel1,Integer.parseInt(sel3));break;}
					case 4:{p4.JadPlayer(sel1,Integer.parseInt(sel3));break;}
					}
				}
				
				
				System.out.println("Is this correct? (y/n)\n"
								 + " -Playername- | -Class- ");
				
				switch(sel2){
				case 4:{
					sel1 = "             ".substring(p4.name.length());
					System.out.printf (" %s"+sel1+"| %s \n", p4.name, p4.toS(0));
				}
				case 3:{
					sel1 = "             ".substring(p3.name.length());
					System.out.printf (" %s"+sel1+"| %s \n", p3.name, p3.toS(0));
				}
				case 2:{
					sel1 = "             ".substring(p2.name.length());
					System.out.printf (" %s"+sel1+"| %s \n", p2.name, p2.toS(0));
				}
				}
				sel1 = "             ".substring(p1.name.length());
				System.out.printf (" %s"+sel1+"| %s \n", p1.name, p1.toS(0));
				
				sel1 = scan.nextLine();
				while(!(sel1.equals("y")||sel1.equals("n"))){
					System.out.println("Please type (y) for yes, or (n) for no");
					sel1 = scan.nextLine();
				}
				if(sel1.equals("n")){
					break;
				}else{
					System.out.println("Starting adventure...");
					JadMap.drawMap();
					
					
					
					
					
					
					
				}
				
				break;	//end of menu-case start
			}
			case 'o':{
				System.out.println("Work in Progress =)\n"
								 + "(any letter) Back");
				scan.nextLine();
				back = true;
				continue;
			}
			case 'c':{
				break;
			}
			case 'e':{
				scan.close();
				System.exit(0);
				
			}
			
			default:{
				continue;
			}
			
			}
		}
		
		
		
		
		
		
		
		
	}

}
