/*
 * Die Klasse ist, damit wir nicht immer hardcoded Strings nehmen --> man kann mehrere Sprachen machen!
 * wenn es dir nciht gefällt sag bescheid! 
 */
public final class JadDialog {
	
	public static final class CreditsEnglish {
		public static final String gameName = "JavaAndDragons";
		public static final String rapeStudios = "RAPEstudios";
		public static final String firstProgrammer = "Cpt_B";
		public static final String secondProgrammer = "Gamer_PA";
		public static final String dialogProducer = "RinceWind";
		public static final String version = "Version 1.0 alpha";
		
	}
	public static final class DialogTest1{
		
		public static final String[] itemDescription = {"The axe is a tool to break trees", "The coin is the currency.", "This is your map. It takes you to several adventures!"}; //saves the itemDescription
		public static final String[] firstResponse = {"You are such a fool! Good Luck! Here you have the map of the forest.", "Great idea! Here is the map of the forest.", "Without me! But good luck! Here you get the map of the forest."}; //saves the first testDialog (with merchant)
		
		public static String FirstResponse(int number) {
			return DialogTest1.firstResponse[number-1];
		}
	}
	
	

}
