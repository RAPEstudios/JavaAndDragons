
public class Generate {

	public static void main(String[] args) {
	
		ForestRobot rob = new ForestRobot();
		
		int mid = 25;
		int minSize = 5;
		int maxSize = 25;
		int step;
		int pxend,nxend,pyend,nyend;
		
		double stepprob = 0.8;
		char[][] tmap = new char[50][50];
		
		for (int i = 0;i<=49;i++){
			for (int ii = 0;ii<=49;ii++){
				
				tmap[i][ii] = '.';
				
			}
		}
		tmap[mid][mid] = '#';
		tmap[mid][mid] = '#';
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
						
						rob.x--;				//robot walks
						tmap[rob.x][rob.y]='#'; //robot places forest-units
						step++;
					}
					nxend=rob.x;
					rob.x=i;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.y++;				//robot walks
						tmap[rob.x][rob.y]='#'; //robot places forest-units
						step++;
					}
					pyend=rob.y;
					rob.y=ii;
					step = 1;
					while((Math.random()<stepprob&&step<=maxSize)||step<=minSize){
						
						rob.y--;				//robot walks
						tmap[rob.x][rob.y]='#'; //robot places forest-units
						step++;
					}
					nyend=rob.y;
					rob.y=ii;
					step = 1;
					
					//adding ellipse-corners
					
					while(rob.y<=pyend){
						
						rob.y++;
						while(step<=ell(pxend-mid,pyend-mid,rob.y-mid)){
						
							rob.x++;				//robot walks
							tmap[rob.x][rob.y]='#'; //robot places forest-units
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y>mid){
						
						rob.y--;
						while(step<=ell(nxend-mid,pyend-mid,rob.y-mid)){
						
							rob.x--;				//robot walks
							tmap[rob.x][rob.y]='#'; //robot places forest-units
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y>=nyend){
						
						rob.y--;
						while(step<=ell(pxend-mid,nyend-mid,rob.y-mid)){
						
							rob.x++;				//robot walks
							tmap[rob.x][rob.y]='#'; //robot places forest-units
							step++;
						}
						step = 1;
						rob.x=ii;
					}
					while(rob.y<mid){
						
						rob.y++;
						while(step<=ell(nxend-mid,nyend-mid,rob.y-mid)){
						
							rob.x--;				//robot walks
							tmap[rob.x][rob.y]='#'; //robot places forest-units
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
		double rob_x = Math.random()*3+
				      (Math.round(Math.sqrt(rx-rob_y*rx/ry)));
		return (int) rob_x;
	}
	
}
