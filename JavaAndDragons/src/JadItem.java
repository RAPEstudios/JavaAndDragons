
public class JadItem extends JadObj{

	int itemId,amount,storage; //[Storage] 0:on the map 1-4: player's inventory 5:crate ... 
	
	/*itemId list:
	 * 1: bandages
	 * 2: apple
	 * 3: banana
	 */
	
	
	
	
	
	
	public void heal(JadPlayer px){
		System.out.printf("healing %s",px.name);
		switch(itemId){
		case 1:{
			System.out.printf("restoring 40 health points!");
			px.hp[0]+=40;
		}
		}
		if(px.hp[0]>px.hp[1]){
			px.hp[0]=px.hp[1];
		}
	}
}
