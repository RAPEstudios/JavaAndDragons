
public class JadMap {
	
	static int[][] map = new int[1000][1000]; //the map is stored in a two-dimensional array
	
	public static void drawMap() {
		int rGen;
		
		//map generation
		for (int i = 0;i<=1000;i++){
			for (int ii = 0;ii<=1000;ii++){
				
				rGen = (int) (Math.random()*10000);
				
				//map marks for:
				if(rGen<100){
					map[i][ii] = -2; //2: forest
				}
				else if(rGen<200){
					map[i][ii] = -3; //3: tall grass
				}
				else if(rGen<300){
					map[i][ii] = -4; //4: lake
				}
				else if(rGen<310){
					map[i][ii] = -5; //5: village
				}
				else if(rGen<305){
					map[i][ii] = -6; //6: dungeon
				}
				else{
					map[i][ii] = -1; //1: grass (regular terrain)
				}
			}
			map[i][0]= 0; 			//0: end of map
			map[i][1000]= 0;
			map[0][i]= 0;
			map[1000][i]= 0;
			
			
			
			
		}
		
		drawStructure(2,15,5,3);
		
		for (int i = 49;i>-1;i--){
				for (int ii = 0;ii<=49;ii++){
					
					System.out.print(map[ii][i]+" ");
					
				}
				System.out.print("\n");
			}
		
	}	
		//map structure generator
	public static int[][] drawStructure(int type, int maxSize, int minSize, int rand_factor){
		
		int x,y,mid_x,mid_y;
		int pxend,nxend,pyend,nyend,step;
		double stepprob = 0.8;
		
		for (int i = 0;i<=49;i++){
			for (int ii = 0;ii<=49;ii++){

				
				if(map[i][ii]==type){
					
					mid_x = x = i;
					mid_y = y = ii;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						x++;			//robot walks
						if(map[x][y]==0){
							break;
						}
						map[x][y]=type; //robot places forest-units
						step++;
					}
					pxend=x;
					x=i;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						x--;			//robot walks
						if(map[x][y]==0){
							break;
						}
						map[x][y]=type; //robot places forest-units
						step++;
					}
					nxend=x;
					x=i;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						y++;			//robot walks
						if(map[x][y]==0){
							break;
						}
						map[x][y]=type; //robot places forest-units
						step++;
					}
					pyend=y;
					y=ii;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						y--;			//robot walks
						if(map[x][y]==0){
							break;
						}
						map[x][y]=type; //robot places forest-units
						step++;
					}
					nyend=y;
					y=ii;
					step = 1;
					
					//adding ellipse-corners
					
					while(y<=pyend){
						
						y++;
						while(step<=Math.random()*rand_factor+ell(pxend-mid_x,pyend-mid_y,y-mid_y)){
						
							x++;			//robot walks
							if(map[x][y]==0){
								break;
							}
							map[x][y]=type; //robot places forest-units
							step++;
						}
						step = 1;
						x=ii;
					}
					while(y>mid_y){
						
						y--;
						while(step<=Math.random()*rand_factor+ell(nxend-mid_x,pyend-mid_y,y-mid_y)){
						
							x--;				//robot walks
							if(map[x][y]==0){
								break;
							}
							map[x][y]=type; //robot places forest-units
							step++;
						}
						step = 1;
						x=ii;
					}
					while(y>=nyend){
						
						y--;
						while(step<=Math.random()*rand_factor+ell(pxend-mid_x,nyend-mid_y,y-mid_y)){
						
							x++;				//robot walks
							if(map[x][y]==0){
								break;
							}
							map[x][y]=type; //robot places forest-units
							step++;
						}
						step = 1;
						x=ii;
					}
					while(y<mid_y){
						
						y++;
						while(step<=Math.random()*rand_factor+ell(nxend-mid_x,nyend-mid_y,y-mid_y)){
						
							x--;				//robot walks
							if(map[x][y]==0){
								break;
							}
							map[x][y]=type; //robot places forest-units
							step++;
						}
						step = 1;
						x=ii;
					}	
				}
			}
		}
		
		return map;
		
	}
	public static int ell(int int_rx,int int_ry,int int_rob_y){
		
		double rx = Math.pow((double) int_rx, 2);
		double ry = Math.pow((double) int_ry, 2);
		double rob_y = Math.pow((double) int_rob_y, 2);
		return (int) (Math.round(Math.sqrt(rx-rob_y*rx/ry)));
	}
		
}
