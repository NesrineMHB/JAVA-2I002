public class Machine{
	private Avant av;
	private Arriere ar;
	private String couleur;

	public Machine( Avant av, Arriere ar, String c){
		this.av=av;
		this.ar=ar;
		couleur=c;
	}

	public String toString(){
		return "la machine est composée de"+av+","+ar+"et est de couleur"+couleur;
	}
	
	public Machine (Machine m){
		this(m.av,m.ar,m.couleur);
	}
}
