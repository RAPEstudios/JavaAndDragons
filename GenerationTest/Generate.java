
public class Generate {

	public static void main(String[] args) {
	
		ForestRobot rob = new ForestRobot();
		
		int posxy = 25;
		int rad = 20;
		int minSize = 3;
		int maxSize = 20;
		int step;
		int pxend,nxend,pyend,nyend;
		
		double stepprob = 0.8;
		char[][] tmap = new char[50][50];
		
		for (int i = 0;i<=49;i++){
			for (int ii = 0;ii<=49;ii++){
				
				tmap[i][ii] = '.';
				
			}
		}
		tmap[posxy][posxy] = '#';
		generation:{
		for (int i = 0;i<=49;i++){
			for (int ii = 0;ii<=49;ii++){

				
				if(tmap[i][ii]=='#'){
					
					rob.x=i;
					rob.y=ii;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.x++;				//robot walks
						tmap[rob.x][rob.y]='#'; //robot places forest-units
						step++;
					}
					pxend=rob.x;
					rob.x=i;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.x--;				
						tmap[rob.x][rob.y]='#'; 
						step++;
					}
					nxend=rob.x;
					rob.x=i;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.y++;				
						tmap[rob.x][rob.y]='#';
						step++;
					}
					pyend=rob.y;
					rob.y=ii;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.y--;				
						tmap[rob.x][rob.y]='#';
						step++;
					}
					nyend=rob.y;
					rob.y=ii;
					step = 1;
					
					//adding ellipse-corners
					
					while(rob.y<=pyend){
						
						rob.y++;
						while(step<=ell(pxend-posxy,pyend-posxy,rob.y-posxy)){
						
							rob.x++;				
							tmap[rob.x][rob.y]='#'; 
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y>posxy){
						
						rob.y--;
						while(step<=ell(nxend-posxy,pyend-posxy,rob.y-posxy)){
						
							rob.x--;				
							tmap[rob.x][rob.y]='#'; 
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y>=nyend){
						
						rob.y--;
						while(step<=ell(pxend-posxy,nyend-posxy,rob.y-posxy)){
						
							rob.x++;				
							tmap[rob.x][rob.y]='#'; 
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y<posxy){
						
						rob.y++;
						while(step<=ell(nxend-posxy,nyend-posxy,rob.y-posxy)){
						
							rob.x--;				
							tmap[rob.x][rob.y]='#'; 
							step++;
						}
						step = 1;
						rob.x=ii;
					}					
					
					
					break generation;
				}
				
			}
		}
		}
		
		
		
		//Ausgabe
		
		for (int i = 49;i>-1;i--){
			for (int ii = 0;ii<=49;ii++){
				
				System.out.print(tmap[ii][i]+" ");
				
			}
			System.out.print("\n");
		}
		
	}
	
	public static int ell(int int_rx,int int_ry,int int_rob_y){
		double rx = Math.pow((double) int_rx, 2);
		double ry = Math.pow((double) int_ry, 2);
		double rob_y = Math.pow((double) int_rob_y, 2);
		return (int)(Math.round(Math.sqrt(rx-rob_y*rx/ry)));
	}
	
}
