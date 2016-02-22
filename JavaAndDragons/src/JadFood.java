
public class JadFood extends JadItem{
	
	public JadFood(){
		this.itemId=itemId;
	}
	
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
