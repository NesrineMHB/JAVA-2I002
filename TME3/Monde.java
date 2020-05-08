public class Monde{
	private int dimx,dimy,noGener;
	private boolean tabCells[][];
	
	public Monde(int dimx,int dimy, double seuil){
		this.dimx=dimx;
		this.dimy=dimy;	
		
                int i,j;
		for(i=0;i<dimx;i++){
			for(j=0;j<dimy;j++){
				if (Math.random()<seuil) tabCells[i][j]=true ;  
				else  tabCells[i][j]=false; 
			                   }
				   }
		
		
	}
	
	public String toString(){
		
		int i,j;
  		String s= "+noGener+";
		//s=s+"+noGener+";
		for(i=0;i<dimx;i++){
			s=s+"\n";
			for(j=0;j<dimy;j++){
				if(tabCells[i][j]==false) s=s+".\t";
				else s=s+"*\t";
			                   }
	       
		}
		return s ;
	}
		
                 

}
