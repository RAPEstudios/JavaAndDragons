
public class JadMap {
	
	public static void drawMap() {
		
		//map generation
		
		int[][] map = new int[100][100]; //the map is stored in a two-dimensional array
		
		for (int i = 0;i<101;i++){
			for (int ii = 0;ii<101;ii++){
				
				int rGen = (int) (Math.random()*10000);
				
				//map marks for:
				if(rGen<100){
					map[i][ii] = 1; //forest
				}
				else if(rGen<200){
					map[i][ii] = 2; //tall grass
				}
				else if(rGen<300){
					map[i][ii] = 3; //lake
				}
				else if(rGen<310){
					map[i][ii] = 4; //village
				}
				else if(rGen<305){
					map[i][ii] = 5; //dungeon
				}
				else{
					map[i][ii] = 0; //grass (regular terrain)
				}
			}
		}
		
		//map structure generation
		
		for (int i = 0;i<101;i++){
			for (int ii = 0;ii<101;ii++){
				
				switch(map[i][ii]){
				
				}
				
			}
		}
			
	}

}
