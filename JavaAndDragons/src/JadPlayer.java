
public class JadPlayer extends JadObj{

	String name = "not in use";
	int[] hp = {0,0};
	int cclass;
	JadItem[] invitems;
	
	public JadPlayer(){
		x=y=250;
	}
	public void JadPlayer(String name, int cclass){
		this.name=name;
		this.cclass=cclass;
		
		
		int hp_c;
		switch(cclass){
		case 0:{hp_c=140;break;}
		case 1:{hp_c=100;break;}
		case 2:{hp_c=100;break;}
		case 3:{hp_c=70;break;}
		default:{hp_c=1;System.err.println("Something went wrong. Please restart!");break;}
		}
		hp[0]=hp[1]=(int) (hp_c-hp_c/20+hp_c/10*Math.random());
	}
	public String toS(int n){
		
		switch(n){
		case 0: {return cclass==0?
			"warrior" : cclass==1?
			"archer"  : cclass==2?
			"wizard"  :
			"rogue";
		}
		case 1: {
			
		}
		default:{
			return "notfound";
		}
		}
		
	}
	
		
		
}
	
	

