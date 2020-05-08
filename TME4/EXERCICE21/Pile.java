public class Pile{
	private int TailleMax;
	private Machin [] pile;
	//Machin m1= new Machin();
	p
	public Pile(int TailleMax){
	this.TailleMax=TailleMax;
	pile= new pile[TailleMax];
	}
	public void empiler(Machin m){
		int i=0;
		while(Pile [i]!=null && i<TailleMax)
			i++;
		Pile[i]=m;
	}
	
	public void depiler(){
		int i=0;
	
		while(Pile [i]!=0 && i<TailleMax)
			i++;
		Pile[tete--]=null;
	}
	
	public boolean estVide(){
		return( Pile[0]==null);}

	public boolean estPlein(){
		return( Pile[TailleMax-1]!=null);}

	public String toString()
