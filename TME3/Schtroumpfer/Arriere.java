public class Arriere{
	private PieceA a1;
	private PieceC c1,c2;
	
	public Arriere( PieceA a1, PieceC c1, PieceC c2){
		this.a1=a1;
		this.c1=c1;
		this.c2=c2;
	}

	public String toString(){
		return "la partie avant est composée de "+a1+", "+c1+", "+c2+".";
	}

	public Arriere (Arriere ar){
		this(ar.a1,ar.c1,ar.c2);
	}
}
