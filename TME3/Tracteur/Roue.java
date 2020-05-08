public class Roue{
	private int diametre;
	
	public Roue(int diametre){
		this.diametre=diametre;
	}
	public Roue(){
		this(60);
	}
	public String toString(){
		return "le diametre de la roue est "+diametre;
	}

	public Roue copy(){
		return new Roue (diametre);
	}
}
