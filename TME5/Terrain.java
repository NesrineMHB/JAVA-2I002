public class Terrain{
	public final int taille=20;
	Case [][] matrice;
	int i,j;
	public Terrain(){
		matrice =new Case[taille][taille];
		for(i=0;i<taille;i++){
			for(j=0;j<taille;j++){	
				matrice [i][j]=new Case();	
				if(Math.random()<0.05) matrice [i][j].setMouton(new Mouton());
			}
		}
	}

	public String toString(){
		
		String s="";
		for(i=0;i<taille+2;i++) 
			s+=" - ";
		s+="\n";
		
		for(i=0;i<taille;i++){
			s+="|";
			for(j=0;j<taille;j++)
				s+=matrice [i][j].toString();
			s+="|\n";		
		}
		for(i=0;i<taille+2;i++) 
			s+=" - ";
		return s;
	}

	public void update(){
		for(i=0;i<taille;i++){
			for(j=0;j<taille;j++){	
				if(matrice [i][j].getMouton()!=null && j<taille-1 && matrice [i][j+1].getMouton()==null && Math.random()<1.0/5 ){
					matrice [i][j+1].setMouton(matrice [i][j].getMouton());
					matrice [i][j].setMouton(null);
				}
			}
		}
	}
}
