
public class JadHeal extends JadItem{
	
	public JadHeal(){
		this.itemId=itemId;
	}
	
	public void heal(JadPlayer px){
		System.out.printf("healing %s",px.name);
		switch(itemId){
		case 1:{
			System.out.printf("restoring 40 health points!");
			px.hp+=40;
		}
		case 2:{
			System.out.printf("regenerating!");
		}
		}
		if(px.hp>px.hpmax){
			px.hp=px.hpmax;
		}
	}
	
}
