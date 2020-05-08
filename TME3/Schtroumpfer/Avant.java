public class Avant{
	private PieceA a1,a2;
	private PieceB b1;
	
	public Avant( PieceA a1, PieceA a2, PieceB b1){
		this.a1=a1;
		this.a2=a2;
		this.b1=b1;
	}

	public String toString(){
		return "la partie avant est composée de "+a1+", "+a2+", "+b1+".";
	}

	public Avant (Avant av){
		this(av.a1,av.a2,av.b1);
	}
}
